package com.marshal.mapper;

import com.marshal.pojo.TbUser;

import java.util.List;

public interface TbUserMapper {
    List<TbUser> selectByCondition(TbUser condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}