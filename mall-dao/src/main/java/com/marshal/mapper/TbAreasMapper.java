package com.marshal.mapper;

import com.marshal.pojo.TbAreas;

import java.util.List;

public interface TbAreasMapper {
    List<TbAreas> selectByCondition(TbAreas condition);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAreas record);

    int insertSelective(TbAreas record);

    TbAreas selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbAreas record);

    int updateByPrimaryKey(TbAreas record);
}