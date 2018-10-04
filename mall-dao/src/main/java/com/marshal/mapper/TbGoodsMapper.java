package com.marshal.mapper;

import com.marshal.pojo.TbGoods;

import java.util.List;

public interface TbGoodsMapper {
    List<TbGoods> selectByCondition(TbGoods condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbGoods record);

    int insertSelective(TbGoods record);

    TbGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbGoods record);

    int updateByPrimaryKey(TbGoods record);
}