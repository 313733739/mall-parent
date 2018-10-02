package com.marshal.mapper;

import com.marshal.pojo.TbSeller;
import com.marshal.pojo.TbSellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSellerMapper {
    long countByExample(TbSellerExample example);

    int deleteByExample(TbSellerExample example);

    int insert(TbSeller record);

    int insertSelective(TbSeller record);

    List<TbSeller> selectByExample(TbSellerExample example);

    int updateByExampleSelective(@Param("record") TbSeller record, @Param("example") TbSellerExample example);

    int updateByExample(@Param("record") TbSeller record, @Param("example") TbSellerExample example);
}