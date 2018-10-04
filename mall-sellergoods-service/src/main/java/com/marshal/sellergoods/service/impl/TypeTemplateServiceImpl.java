package com.marshal.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.marshal.mapper.TbTypeTemplateMapper;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.TypeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import com.marshal.pojo.TbTypeTemplate;
import java.util.List;
@Service
public class TypeTemplateServiceImpl implements TypeTemplateService {
	@Autowired
	TbTypeTemplateMapper tbTypeTemplateMapper;

	@Override
	public List<TbTypeTemplate> findAll() {
		return tbTypeTemplateMapper.selectByCondition(null);
	}

	@Override
	public ResponseData query(TbTypeTemplate condition,int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<TbTypeTemplate> page = (Page<TbTypeTemplate>) tbTypeTemplateMapper.selectByCondition(condition);
		return new ResponseData(page.getTotal(),page.getResult());
	}

	@Override
	public TbTypeTemplate queryById(Long id) {
		return tbTypeTemplateMapper.selectByPrimaryKey(id);
	}

	@Override
	public void save(TbTypeTemplate tbTypeTemplate) {
		if(tbTypeTemplate.getId()!=null){
			tbTypeTemplateMapper.updateByPrimaryKey(tbTypeTemplate);
		}else{
			tbTypeTemplateMapper.insert(tbTypeTemplate);
		}
	}

	@Override
	public void delete(Long[] idList) {
		for(Long id :idList){
			tbTypeTemplateMapper.deleteByPrimaryKey(id);
		}
	}
}
