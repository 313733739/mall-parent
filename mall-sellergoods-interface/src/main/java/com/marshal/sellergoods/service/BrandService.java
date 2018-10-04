package com.marshal.sellergoods.service;


import com.marshal.pojo.TbBrand;
import com.marshal.util.ResponseData;
import java.util.List;

public interface BrandService {
    public List<TbBrand> findAll();

    public ResponseData query(TbBrand condition,int pageNum,int pageSize);

    public TbBrand queryById(Long id);

    public void save(TbBrand tbBrand);

    public void delete(Long[] ids);
}
