package com.marshal.mapper;

import com.marshal.pojo.TbOrder;

import java.util.List;

public interface TbOrderMapper {
    List<TbOrder> selectByCondition(TbOrder condition);

    int deleteByPrimaryKey(Long orderId);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    TbOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKey(TbOrder record);
}