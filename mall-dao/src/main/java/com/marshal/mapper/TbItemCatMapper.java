package com.marshal.mapper;

import com.marshal.pojo.TbItemCat;

import java.util.List;

public interface TbItemCatMapper {
    List<TbItemCat> selectByCondition(TbItemCat condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbItemCat record);

    int insertSelective(TbItemCat record);

    TbItemCat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItemCat record);

    int updateByPrimaryKey(TbItemCat record);
}