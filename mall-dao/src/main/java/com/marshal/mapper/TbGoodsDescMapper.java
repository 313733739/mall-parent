package com.marshal.mapper;

import com.marshal.pojo.TbGoodsDesc;
import com.marshal.pojo.TbGoodsDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsDescMapper {
    long countByExample(TbGoodsDescExample example);

    int deleteByExample(TbGoodsDescExample example);

    int insert(TbGoodsDesc record);

    int insertSelective(TbGoodsDesc record);

    List<TbGoodsDesc> selectByExample(TbGoodsDescExample example);

    int updateByExampleSelective(@Param("record") TbGoodsDesc record, @Param("example") TbGoodsDescExample example);

    int updateByExample(@Param("record") TbGoodsDesc record, @Param("example") TbGoodsDescExample example);
}