package lyl.biz.front.index.service;

import lyl.entity.Books;
import lyl.entity.Types;

import java.util.List;

public interface IndexService {
	
	/**
	 * 展示首页左侧的图书分类
	 */
	public List<Types> queryTypes();
	
	/**
	 * 根据ID,显示首页图书的分类
	 */
	public List<Books> queryBooks(String typeId);
	
	/**
	 * 显示图书详情
	 */
	public Books queryBook(String id);
}
