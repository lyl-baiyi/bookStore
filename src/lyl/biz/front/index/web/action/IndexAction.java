package lyl.biz.front.index.web.action;

import java.util.List;

import lyl.biz.front.index.service.IndexService;
import lyl.biz.front.index.service.IndexServiceImpl;
import lyl.biz.util.BasicAction;
import lyl.entity.Books;
import lyl.entity.Types;


/*
 * 首页模块的action
 */
public class IndexAction extends BasicAction {
	
	
	IndexService service = new IndexServiceImpl();
	
	private String typeId;   //接收分类id
	private String id;       //接收图书id
	
	/**
	 * 展示首页左侧的图书分类
	 */
	public String showIndex() throws Exception{

		List<Types> types = service.queryTypes();
		requestMap.put("types", types);
		return "showIndex";
	}
	
	/**
	 * 显示首页图书的分类，根据ID
	 */
	public String queryBooks()throws Exception{
		//获取分类数据
		List<Books> books = service.queryBooks(typeId);
		//保存数据到request域
		requestMap.put("books", books);
		return "queryBooks";
	}
	
	
	/**
	 * 显示图书详情
	 */
	public String queryBook()throws Exception{
		//1)查询图书信息
		Books books = service.queryBook(id);
		//2)保存到request域
		requestMap.put("book", books);
		//3)返回视图
		return "queryBook";
	}
	
	
	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
