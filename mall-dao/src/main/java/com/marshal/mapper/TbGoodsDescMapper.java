package com.marshal.mapper;

import com.marshal.pojo.TbGoodsDesc;

import java.util.List;

public interface TbGoodsDescMapper {
    List<TbGoodsDesc> selectByCondition(TbGoodsDesc condition);

    int deleteByPrimaryKey(Long goodsId);

    int insert(TbGoodsDesc record);

    int insertSelective(TbGoodsDesc record);

    TbGoodsDesc selectByPrimaryKey(Long goodsId);

    int updateByPrimaryKeySelective(TbGoodsDesc record);

    int updateByPrimaryKey(TbGoodsDesc record);
}