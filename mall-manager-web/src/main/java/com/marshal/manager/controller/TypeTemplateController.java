package com.marshal.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.TypeTemplateService;
import com.marshal.pojo.TbTypeTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/typeTemplate")
@RestController
public class TypeTemplateController {
	@Reference
	TypeTemplateService TypeTemplateService;

	@RequestMapping("/queryAll")
	public List<TbTypeTemplate> queryAll(){
		return TypeTemplateService.findAll();
	}

	@RequestMapping("/query")
	public ResponseData query(@RequestBody(required = false) TbTypeTemplate condition,int pageNum,int pageSize){
		return TypeTemplateService.query(condition,pageNum,pageSize);
	}

	@RequestMapping("/queryById")
	public TbTypeTemplate queryById(Long id){
		return TypeTemplateService.queryById(id);
	}

	@RequestMapping("/save")
	public ResponseData save(@RequestBody TbTypeTemplate tbTypeTemplate){
		try{
			TypeTemplateService.save(tbTypeTemplate);
			return new ResponseData(true,"保存成功");
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseData(false,"保存失败");
		}
	}

	@RequestMapping("/delete")
	public ResponseData delete(Long[] idList){
		try{
			TypeTemplateService.delete(idList);
			return new ResponseData(true,"删除成功");
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseData(false,"删除失败");
		}
	}
}
