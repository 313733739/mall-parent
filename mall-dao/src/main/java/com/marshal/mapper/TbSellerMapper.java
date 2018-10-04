package com.marshal.mapper;

import com.marshal.pojo.TbSeller;

import java.util.List;

public interface TbSellerMapper {
    List<TbSeller> selectByCondition(TbSeller condition);

    int deleteByPrimaryKey(String sellerId);

    int insert(TbSeller record);

    int insertSelective(TbSeller record);

    TbSeller selectByPrimaryKey(String sellerId);

    int updateByPrimaryKeySelective(TbSeller record);

    int updateByPrimaryKey(TbSeller record);
}