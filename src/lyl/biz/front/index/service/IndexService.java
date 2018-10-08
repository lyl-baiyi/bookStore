package lyl.biz.front.index.service;

import lyl.entity.Books;
import lyl.entity.Types;

import java.util.List;

public interface IndexService {
	
	/**
	 * չʾ��ҳ����ͼ�����
	 */
	public List<Types> queryTypes();
	
	/**
	 * ����ID,��ʾ��ҳͼ��ķ���
	 */
	public List<Books> queryBooks(String typeId);
	
	/**
	 * ��ʾͼ������
	 */
	public Books queryBook(String id);
}
