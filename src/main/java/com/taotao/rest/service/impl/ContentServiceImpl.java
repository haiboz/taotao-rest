package com.taotao.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.TbContentMapper;
import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentExample;
import com.taotao.rest.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {
	
	@Autowired
	private TbContentMapper mapper;
	@Override
	public List<TbContent> getContentList(Long categoryId) {
		TbContentExample example = new TbContentExample();
		example.createCriteria().andCategoryIdEqualTo(categoryId);
		example.setOrderByClause("updated desc");
		List<TbContent> list = mapper.selectByExample(example);
		return list;
	}

}
