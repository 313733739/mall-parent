package com.marshal.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.marshal.mapper.TbSpecificationMapper;
import com.marshal.mapper.TbSpecificationOptionMapper;
import com.marshal.pojo.TbSpecificationOption;
import com.marshal.pojoext.Specification;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import com.marshal.pojo.TbSpecification;
import java.util.List;
import java.util.Map;

@Service
public class SpecificationServiceImpl implements SpecificationService {
	@Autowired
	TbSpecificationMapper tbSpecificationMapper;
	@Autowired
	TbSpecificationOptionMapper tbSpecificationOptionMapper;

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
		TbSpecification tbSpecification=tbSpecificationMapper.selectByPrimaryKey(id);

		return tbSpecificationMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Map> getOptionList() {
		return tbSpecificationMapper.getOptionList();
	}

	@Override
	public void save(Specification specification) {
		//修改
		if(specification.getTbSpecification().getId()!=null){
			TbSpecification tbSpecification=specification.getTbSpecification();
			tbSpecificationMapper.updateByPrimaryKey(tbSpecification);

			//全删除再全部新增
			tbSpecificationOptionMapper.deleteBySpecId(specification.getTbSpecification().getId());
			List<TbSpecificationOption> rows =specification.getRows();
			for(TbSpecificationOption item:rows){
				item.setSpecId(tbSpecification.getId());
				tbSpecificationOptionMapper.insert(item);
			}
		}else{
			//新增
			TbSpecification tbSpecification=specification.getTbSpecification();
			tbSpecificationMapper.insert(tbSpecification);

			List<TbSpecificationOption> rows =specification.getRows();
			for(TbSpecificationOption item:rows){
				item.setSpecId(tbSpecification.getId());
				tbSpecificationOptionMapper.insert(item);
			}
		}
	}

	@Override
	public void delete(Long[] idList) {
		for(Long id :idList){
			tbSpecificationMapper.deleteByPrimaryKey(id);
			tbSpecificationOptionMapper.deleteBySpecId(id);
		}
	}
}
