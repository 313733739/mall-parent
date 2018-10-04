package com.marshal.mapper;

import com.marshal.pojo.TbSpecification;

import java.util.List;

public interface TbSpecificationMapper {
    List<TbSpecification> selectByCondition(TbSpecification condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbSpecification record);

    int insertSelective(TbSpecification record);

    TbSpecification selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSpecification record);

    int updateByPrimaryKey(TbSpecification record);
}