package com.marshal.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.marshal.mapper.TbGoodsMapper;
import com.marshal.util.ResponseData;
import com.marshal.sellergoods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import com.marshal.pojo.TbGoods;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	TbGoodsMapper tbGoodsMapper;

	@Override
	public List<TbGoods> findAll() {
		return tbGoodsMapper.selectByCondition(null);
	}

	@Override
	public ResponseData query(TbGoods condition,int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<TbGoods> page = (Page<TbGoods>) tbGoodsMapper.selectByCondition(condition);
		return new ResponseData(page.getTotal(),page.getResult());
	}

	@Override
	public TbGoods queryById(Long id) {
		return tbGoodsMapper.selectByPrimaryKey(id);
	}

	@Override
	public void save(TbGoods tbGoods) {
		if(tbGoods.getId()!=null){
			tbGoodsMapper.updateByPrimaryKey(tbGoods);
		}else{
			tbGoodsMapper.insert(tbGoods);
		}
	}

	@Override
	public void delete(Long[] idList) {
		for(Long id :idList){
			tbGoodsMapper.deleteByPrimaryKey(id);
		}
	}
}
