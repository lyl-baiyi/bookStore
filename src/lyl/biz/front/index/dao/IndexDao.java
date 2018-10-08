package lyl.biz.front.index.dao;

import lyl.entity.Books;
import lyl.entity.Types;

import java.awt.print.Book;
import java.util.List;

public interface IndexDao {

	//��ѯͼ�����
	public List<Types> queryTypes();
	//���ݷ���id��ѯ��Ӧ��ͼ��
	public List<Books> queryBooks(String typeId);
	//����id��ѯ��Ӧ��ͼ��
	public Books queryBook(String id);
}
