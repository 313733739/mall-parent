package com.marshal.mapper;

import com.marshal.pojo.TbAddress;

import java.util.List;

public interface TbAddressMapper {
    List<TbAddress> selectByCondition(TbAddress condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbAddress record);

    int insertSelective(TbAddress record);

    TbAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbAddress record);

    int updateByPrimaryKey(TbAddress record);
}