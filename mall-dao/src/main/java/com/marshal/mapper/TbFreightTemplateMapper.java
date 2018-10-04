package com.marshal.mapper;

import com.marshal.pojo.TbFreightTemplate;

import java.util.List;

public interface TbFreightTemplateMapper {
    List<TbFreightTemplate> selectByCondition(TbFreightTemplate condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbFreightTemplate record);

    int insertSelective(TbFreightTemplate record);

    TbFreightTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbFreightTemplate record);

    int updateByPrimaryKey(TbFreightTemplate record);
}