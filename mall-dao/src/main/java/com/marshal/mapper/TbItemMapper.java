package com.marshal.mapper;

import com.marshal.pojo.TbItem;

import java.util.List;

public interface TbItemMapper {
    List<TbItem> selectByCondition(TbItem condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    TbItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);
}