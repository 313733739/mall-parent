package com.marshal.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
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
}
