package com.marshal.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.GoodsService;
import com.marshal.pojo.TbGoods;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/goods")
@RestController
public class GoodsController {
	@Reference
	GoodsService GoodsService;

	@RequestMapping("/queryAll")
	public List<TbGoods> queryAll(){
		return GoodsService.findAll();
	}

	@RequestMapping("/query")
	public ResponseData query(@RequestBody(required = false) TbGoods condition,int pageNum,int pageSize){
		return GoodsService.query(condition,pageNum,pageSize);
	}

	@RequestMapping("/queryById")
	public TbGoods queryById(Long id){
		return GoodsService.queryById(id);
	}

	@RequestMapping("/save")
	public ResponseData save(@RequestBody TbGoods tbGoods){
		try{
			GoodsService.save(tbGoods);
			return new ResponseData(true,"保存成功");
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseData(false,"保存失败");
		}
	}

	@RequestMapping("/delete")
	public ResponseData delete(Long[] idList){
		try{
			GoodsService.delete(idList);
			return new ResponseData(true,"删除成功");
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseData(false,"删除失败");
		}
	}
}
