package com.marshal.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.marshal.mapper.TbBrandMapper;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import com.marshal.pojo.TbBrand;
import java.util.List;
import java.util.Map;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> findAll() {
        return tbBrandMapper.selectByCondition(null);
    }

    @Override
    public ResponseData query(TbBrand condition,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<TbBrand> page = (Page<TbBrand>) tbBrandMapper.selectByCondition(condition);
        return new ResponseData(page.getTotal(),page.getResult());
    }

    @Override
    public TbBrand queryById(Long id) {
        return tbBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Map> getOptionList() {
        return tbBrandMapper.getOptionList();
    }

    @Override
    public void save(TbBrand tbBrand) {
        if(tbBrand.getId()!=null){
            tbBrandMapper.updateByPrimaryKey(tbBrand);
        }else{
            tbBrandMapper.insert(tbBrand);
        }
    }

    @Override
    public void delete(Long[] idList) {
        for(Long id :idList){
            tbBrandMapper.deleteByPrimaryKey(id);
        }
    }
}
