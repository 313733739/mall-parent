package com.marshal.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.marshal.mapper.TbSpecificationMapper;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import com.marshal.pojo.TbSpecification;
import java.util.List;
@Service
public class SpecificationServiceImpl implements SpecificationService {
	@Autowired
	TbSpecificationMapper tbSpecificationMapper;

	@Override
	public List<TbSpecification> findAll() {
		return tbSpecificationMapper.selectByCondition(null);
	}

	@Override
	public ResponseData query(TbSpecification condition,int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<TbSpecification> page = (Page<TbSpecification>) tbSpecificationMapper.selectByCondition(condition);
		return new ResponseData(page.getTotal(),page.getResult());
	}

	@Override
	public TbSpecification queryById(Long id) {
		return tbSpecificationMapper.selectByPrimaryKey(id);
	}

	@Override
	public void save(TbSpecification tbSpecification) {
		if(tbSpecification.getId()!=null){
			tbSpecificationMapper.updateByPrimaryKey(tbSpecification);
		}else{
			tbSpecificationMapper.insert(tbSpecification);
		}
	}

	@Override
	public void delete(Long[] idList) {
		for(Long id :idList){
			tbSpecificationMapper.deleteByPrimaryKey(id);
		}
	}
}
