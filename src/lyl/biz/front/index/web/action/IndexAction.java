package lyl.biz.front.index.web.action;

import java.util.List;

import lyl.biz.front.index.service.IndexService;
import lyl.biz.front.index.service.IndexServiceImpl;
import lyl.biz.util.BasicAction;
import lyl.entity.Books;
import lyl.entity.Types;


/*
 * ��ҳģ���action
 */
public class IndexAction extends BasicAction {
	
	
	IndexService service = new IndexServiceImpl();
	
	private String typeId;   //���շ���id
	private String id;       //����ͼ��id
	
	/**
	 * չʾ��ҳ����ͼ�����
	 */
	public String showIndex() throws Exception{

		List<Types> types = service.queryTypes();
		requestMap.put("types", types);
		return "showIndex";
	}
	
	/**
	 * ��ʾ��ҳͼ��ķ��࣬����ID
	 */
	public String queryBooks()throws Exception{
		//��ȡ��������
		List<Books> books = service.queryBooks(typeId);
		//�������ݵ�request��
		requestMap.put("books", books);
		return "queryBooks";
	}
	
	
	/**
	 * ��ʾͼ������
	 */
	public String queryBook()throws Exception{
		//1)��ѯͼ����Ϣ
		Books books = service.queryBook(id);
		//2)���浽request��
		requestMap.put("book", books);
		//3)������ͼ
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
