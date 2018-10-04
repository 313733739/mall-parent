package com.marshal.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.ItemCatService;
import com.marshal.pojo.TbItemCat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/itemCat")
@RestController
public class ItemCatController {
	@Reference
	ItemCatService ItemCatService;

	@RequestMapping("/queryAll")
	public List<TbItemCat> queryAll(){
		return ItemCatService.findAll();
	}

	@RequestMapping("/query")
	public ResponseData query(@RequestBody(required = false) TbItemCat condition,int pageNum,int pageSize){
		return ItemCatService.query(condition,pageNum,pageSize);
	}

	@RequestMapping("/queryById")
	public TbItemCat queryById(Long id){
		return ItemCatService.queryById(id);
	}

	@RequestMapping("/save")
	public ResponseData save(@RequestBody TbItemCat tbItemCat){
		try{
			ItemCatService.save(tbItemCat);
			return new ResponseData(true,"保存成功");
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseData(false,"保存失败");
		}
	}

	@RequestMapping("/delete")
	public ResponseData delete(Long[] idList){
		try{
			ItemCatService.delete(idList);
			return new ResponseData(true,"删除成功");
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseData(false,"删除失败");
		}
	}
}
