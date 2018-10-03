package com.marshal.sellergoods.service;


import com.marshal.entity.ResponseData;
import com.marshal.pojo.TbBrand;

import java.util.List;

public interface BrandService {
    public List<TbBrand> findAll();

    public ResponseData queryByPage(int pageNum,int pageSize);
}
