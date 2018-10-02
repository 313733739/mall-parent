package com.marshal.mapper;

import com.marshal.pojo.TbFreightTemplate;
import com.marshal.pojo.TbFreightTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFreightTemplateMapper {
    long countByExample(TbFreightTemplateExample example);

    int deleteByExample(TbFreightTemplateExample example);

    int insert(TbFreightTemplate record);

    int insertSelective(TbFreightTemplate record);

    List<TbFreightTemplate> selectByExample(TbFreightTemplateExample example);

    int updateByExampleSelective(@Param("record") TbFreightTemplate record, @Param("example") TbFreightTemplateExample example);

    int updateByExample(@Param("record") TbFreightTemplate record, @Param("example") TbFreightTemplateExample example);
}