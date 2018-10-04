package com.marshal.mapper;

import com.marshal.pojo.TbProvinces;

import java.util.List;

public interface TbProvincesMapper {
    List<TbProvinces> selectByCondition(TbProvinces condition);

    int deleteByPrimaryKey(Integer id);

    int insert(TbProvinces record);

    int insertSelective(TbProvinces record);

    TbProvinces selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbProvinces record);

    int updateByPrimaryKey(TbProvinces record);
}