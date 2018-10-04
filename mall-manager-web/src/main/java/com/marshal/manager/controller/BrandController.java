package com.marshal.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.BrandService;
import com.marshal.pojo.TbBrand;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RequestMapping("/brand")
@RestController
public class BrandController {
    @Reference
    BrandService brandService;

    @RequestMapping("/queryAll")
    public List<TbBrand> queryAll(){
        return brandService.findAll();
    }

    @RequestMapping("/query")
    public ResponseData query(@RequestBody(required = false) TbBrand condition,int pageNum,int pageSize){
        return brandService.query(condition,pageNum,pageSize);
    }

    @RequestMapping("/queryById")
    public TbBrand queryById(Long id){
        return brandService.queryById(id);
    }

    @RequestMapping("/save")
    public ResponseData save(@RequestBody TbBrand tbBrand){
        try{
            brandService.save(tbBrand);
            return new ResponseData(true,"保存成功");
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseData(false,"保存失败");
        }
    }

    @RequestMapping("/delete")
    public ResponseData delete(Long[] idList){
        try{
            brandService.delete(idList);
            return new ResponseData(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseData(false,"删除失败");
        }
    }

    @RequestMapping("/getOptionList")
    public List<Map> getOptionList(){
        return brandService.getOptionList();
    }
}
