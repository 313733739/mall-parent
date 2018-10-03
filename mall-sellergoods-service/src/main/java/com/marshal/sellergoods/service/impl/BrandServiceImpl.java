package com.marshal.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.marshal.entity.ResponseData;
import com.marshal.mapper.TbBrandMapper;
import com.marshal.sellergoods.service.BrandService;
import com.marshal.pojo.TbBrand;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> findAll() {
        return tbBrandMapper.selectByExample(null);
    }

    @Override
    public ResponseData queryByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<TbBrand> page = (Page<TbBrand>) tbBrandMapper.selectByExample(null);
        return new ResponseData(page.getTotal(),page.getResult());
    }
}
