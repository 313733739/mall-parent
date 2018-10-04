package com.marshal.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.SpecificationService;
import com.marshal.pojo.TbSpecification;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/specification")
@RestController
public class SpecificationController {
	@Reference
	SpecificationService SpecificationService;

	@RequestMapping("/queryAll")
	public List<TbSpecification> queryAll(){
		return SpecificationService.findAll();
	}

	@RequestMapping("/query")
	public ResponseData query(@RequestBody(required = false) TbSpecification condition,int pageNum,int pageSize){
		return SpecificationService.query(condition,pageNum,pageSize);
	}

	@RequestMapping("/queryById")
	public TbSpecification queryById(Long id){
		return SpecificationService.queryById(id);
	}

	@RequestMapping("/save")
	public ResponseData save(@RequestBody TbSpecification tbSpecification){
		try{
			SpecificationService.save(tbSpecification);
			return new ResponseData(true,"保存成功");
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseData(false,"保存失败");
		}
	}

	@RequestMapping("/delete")
	public ResponseData delete(Long[] idList){
		try{
			SpecificationService.delete(idList);
			return new ResponseData(true,"删除成功");
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseData(false,"删除失败");
		}
	}
}
