package com.marshal.mapper;

import com.marshal.pojo.TbTypeTemplate;

import java.util.List;

public interface TbTypeTemplateMapper {
    List<TbTypeTemplate> selectByCondition(TbTypeTemplate condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbTypeTemplate record);

    int insertSelective(TbTypeTemplate record);

    TbTypeTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbTypeTemplate record);

    int updateByPrimaryKey(TbTypeTemplate record);
}