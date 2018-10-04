package com.marshal.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.marshal.pojo.TbSpecificationOption;
import com.marshal.pojoext.Specification;
import com.marshal.sellergoods.service.SpecificationOptionService;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.SpecificationService;
import com.marshal.pojo.TbSpecification;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RequestMapping("/specification")
@RestController
public class SpecificationController {
	@Reference
	SpecificationService specificationService;
	@Reference
	SpecificationOptionService specificationOptionService;

	@RequestMapping("/queryAll")
	public List<TbSpecification> queryAll(){
		return specificationService.findAll();
	}

	@RequestMapping("/query")
	public ResponseData query(@RequestBody(required = false) TbSpecification condition,int pageNum,int pageSize){
		return specificationService.query(condition,pageNum,pageSize);
	}

	@RequestMapping("/queryById")
	public Specification queryById(Long id){
		Specification specification=new Specification();
		TbSpecification tbSpecification =specificationService.queryById(id);
		specification.setTbSpecification(tbSpecification);
		List<TbSpecificationOption> rows=specificationOptionService.queryBySpecId(id);
		if(rows!=null){
			specification.setRows(rows);
		}
		return specification;
	}

	@RequestMapping("/save")
	public ResponseData save(@RequestBody Specification specification){
		try{
			specificationService.save(specification);
			return new ResponseData(true,"保存成功");
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseData(false,"保存失败");
		}
	}

	@RequestMapping("/delete")
	public ResponseData delete(Long[] idList){
		try{
			specificationService.delete(idList);
			return new ResponseData(true,"删除成功");
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseData(false,"删除失败");
		}
	}

	@RequestMapping("/getOptionList")
	public List<Map> getOptionList(){
		return specificationService.getOptionList();
	}
}
