package com.marshal.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.marshal.mapper.TbItemCatMapper;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import com.marshal.pojo.TbItemCat;
import java.util.List;
@Service
public class ItemCatServiceImpl implements ItemCatService {
	@Autowired
	TbItemCatMapper tbItemCatMapper;

	@Override
	public List<TbItemCat> findAll() {
		return tbItemCatMapper.selectByCondition(null);
	}

	@Override
	public ResponseData query(TbItemCat condition,int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<TbItemCat> page = (Page<TbItemCat>) tbItemCatMapper.selectByCondition(condition);
		return new ResponseData(page.getTotal(),page.getResult());
	}

	@Override
	public TbItemCat queryById(Long id) {
		return tbItemCatMapper.selectByPrimaryKey(id);
	}

	@Override
	public void save(TbItemCat tbItemCat) {
		if(tbItemCat.getId()!=null){
			tbItemCatMapper.updateByPrimaryKey(tbItemCat);
		}else{
			tbItemCatMapper.insert(tbItemCat);
		}
	}

	@Override
	public void delete(Long[] idList) {
		for(Long id :idList){
			tbItemCatMapper.deleteByPrimaryKey(id);
		}
	}
}
