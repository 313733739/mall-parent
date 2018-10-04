package com.marshal.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.marshal.mapper.TbSpecificationOptionMapper;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.SpecificationOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import com.marshal.pojo.TbSpecificationOption;
import java.util.List;
@Service
public class SpecificationOptionServiceImpl implements SpecificationOptionService {
	@Autowired
	TbSpecificationOptionMapper tbSpecificationOptionMapper;

	@Override
	public List<TbSpecificationOption> findAll() {
		return tbSpecificationOptionMapper.selectByCondition(null);
	}

	@Override
	public ResponseData query(TbSpecificationOption condition,int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<TbSpecificationOption> page = (Page<TbSpecificationOption>) tbSpecificationOptionMapper.selectByCondition(condition);
		return new ResponseData(page.getTotal(),page.getResult());
	}

	@Override
	public TbSpecificationOption queryById(Long id) {
		return tbSpecificationOptionMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TbSpecificationOption> queryBySpecId(Long id) {
		return tbSpecificationOptionMapper.selectBySpecId(id);
	}

	@Override
	public void save(TbSpecificationOption tbSpecificationOption) {
		if(tbSpecificationOption.getId()!=null){
			tbSpecificationOptionMapper.updateByPrimaryKey(tbSpecificationOption);
		}else{
			tbSpecificationOptionMapper.insert(tbSpecificationOption);
		}
	}

	@Override
	public void delete(Long[] idList) {
		for(Long id :idList){
			tbSpecificationOptionMapper.deleteByPrimaryKey(id);
		}
	}
}
