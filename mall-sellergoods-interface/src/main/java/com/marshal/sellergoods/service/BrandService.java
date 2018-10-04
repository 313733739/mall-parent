package com.marshal.sellergoods.service;


import com.marshal.pojo.TbBrand;
import com.marshal.util.ResponseData;
import java.util.List;
import java.util.Map;

public interface BrandService {
    public List<TbBrand> findAll();

    public ResponseData query(TbBrand condition,int pageNum,int pageSize);

    public TbBrand queryById(Long id);

    List<Map> getOptionList();

    public void save(TbBrand tbBrand);

    public void delete(Long[] ids);
}
