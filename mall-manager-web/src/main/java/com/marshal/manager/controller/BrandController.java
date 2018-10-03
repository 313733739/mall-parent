package com.marshal.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.marshal.entity.ResponseData;
import com.marshal.pojo.TbBrand;
import com.marshal.sellergoods.service.BrandService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/brand")
@RestController
public class BrandController {
    @Reference
    BrandService brandService;

    @RequestMapping("/query")
    public List<TbBrand> queryAll(){
        return brandService.findAll();
    }

    @RequestMapping("/queryByPage")
    public ResponseData queryByPage(int pageNum,int pageSize){
        return brandService.queryByPage(pageNum,pageSize);
    }
}
