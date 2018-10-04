package com.marshal.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.SellerService;
import com.marshal.pojo.TbSeller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/seller")
@RestController
public class SellerController {
	@Reference
	SellerService SellerService;

	@RequestMapping("/queryAll")
	public List<TbSeller> queryAll(){
		return SellerService.findAll();
	}

	@RequestMapping("/query")
	public ResponseData query(@RequestBody(required = false) TbSeller condition,int pageNum,int pageSize){
		return SellerService.query(condition,pageNum,pageSize);
	}

	@RequestMapping("/queryById")
	public TbSeller queryById(String id){
		return SellerService.queryById(id);
	}

	@RequestMapping("/save")
	public ResponseData save(@RequestBody TbSeller tbSeller){
		try{
			SellerService.save(tbSeller);
			return new ResponseData(true,"保存成功");
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseData(false,"保存失败");
		}
	}

	@RequestMapping("/delete")
	public ResponseData delete(String[] idList){
		try{
			SellerService.delete(idList);
			return new ResponseData(true,"删除成功");
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseData(false,"删除失败");
		}
	}
}
