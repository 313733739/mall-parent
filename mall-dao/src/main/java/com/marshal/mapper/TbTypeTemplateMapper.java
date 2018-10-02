package com.marshal.mapper;

import com.marshal.pojo.TbTypeTemplate;
import com.marshal.pojo.TbTypeTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTypeTemplateMapper {
    long countByExample(TbTypeTemplateExample example);

    int deleteByExample(TbTypeTemplateExample example);

    int insert(TbTypeTemplate record);

    int insertSelective(TbTypeTemplate record);

    List<TbTypeTemplate> selectByExample(TbTypeTemplateExample example);

    int updateByExampleSelective(@Param("record") TbTypeTemplate record, @Param("example") TbTypeTemplateExample example);

    int updateByExample(@Param("record") TbTypeTemplate record, @Param("example") TbTypeTemplateExample example);
}