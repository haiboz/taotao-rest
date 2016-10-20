package com.taotao.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.util.ExceptionUtil;
import com.taotao.pojo.TbContent;
import com.taotao.rest.service.ContentService;

/**
 * 首页广告内容发布接口
 * @author 浮生若梦
 * 2016年10月20日 下午2:25:15
 */
@Controller
@RequestMapping("/content")
public class ContentController {
	
	@Autowired
	private ContentService contentServiceImpl;
	@RequestMapping("/list/{categoryId}")
	@ResponseBody
	public TaotaoResult getContentList(@PathVariable Long categoryId){
		try {
			List<TbContent> list = contentServiceImpl.getContentList(categoryId);
			return TaotaoResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	
}
