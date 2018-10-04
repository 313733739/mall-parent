package com.marshal.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.marshal.mapper.TbSellerMapper;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import com.marshal.pojo.TbSeller;
import java.util.List;
@Service
public class SellerServiceImpl implements SellerService {
	@Autowired
	TbSellerMapper tbSellerMapper;

	@Override
	public List<TbSeller> findAll() {
		return tbSellerMapper.selectByCondition(null);
	}

	@Override
	public ResponseData query(TbSeller condition,int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<TbSeller> page = (Page<TbSeller>) tbSellerMapper.selectByCondition(condition);
		return new ResponseData(page.getTotal(),page.getResult());
	}

	@Override
	public TbSeller queryById(String id) {
		return tbSellerMapper.selectByPrimaryKey(id);
	}

	@Override
	public void save(TbSeller tbSeller) {
		if(tbSeller.getSellerId().length()>0){
			tbSellerMapper.updateByPrimaryKey(tbSeller);
		}else{
			tbSellerMapper.insert(tbSeller);
		}
	}

	@Override
	public void delete(String[] idList) {
		for(String id :idList){
			tbSellerMapper.deleteByPrimaryKey(id);
		}
	}
}
