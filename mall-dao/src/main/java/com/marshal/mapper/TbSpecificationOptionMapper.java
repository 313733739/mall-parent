package com.marshal.mapper;

import com.marshal.pojo.TbSpecificationOption;

import java.util.List;

public interface TbSpecificationOptionMapper {
    List<TbSpecificationOption> selectByCondition(TbSpecificationOption condition);

    List<TbSpecificationOption> selectBySpecId(Long id);

    int deleteByPrimaryKey(Long id);

    int deleteBySpecId(Long id);

    int insert(TbSpecificationOption record);

    int insertSelective(TbSpecificationOption record);

    TbSpecificationOption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSpecificationOption record);

    int updateByPrimaryKey(TbSpecificationOption record);
}