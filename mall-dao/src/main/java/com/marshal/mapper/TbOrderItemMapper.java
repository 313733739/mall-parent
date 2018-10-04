package com.marshal.mapper;

import com.marshal.pojo.TbOrderItem;

import java.util.List;

public interface TbOrderItemMapper {
    List<TbOrderItem> selectByCondition(TbOrderItem condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

    TbOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbOrderItem record);

    int updateByPrimaryKey(TbOrderItem record);
}