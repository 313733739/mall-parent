package com.marshal.mapper;

import com.marshal.pojo.TbCities;

import java.util.List;

public interface TbCitiesMapper {
    List<TbCities> selectByCondition(TbCities condition);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCities record);

    int insertSelective(TbCities record);

    TbCities selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbCities record);

    int updateByPrimaryKey(TbCities record);
}