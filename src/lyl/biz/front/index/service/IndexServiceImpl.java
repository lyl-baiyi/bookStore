package lyl.biz.front.index.service;

import lyl.biz.front.index.dao.IndexDao;
import lyl.biz.front.index.dao.IndexDaoImpl;
import lyl.entity.Books;
import lyl.entity.Types;

import java.util.List;
/**
 * Ö÷Ò³µÄservice
 * @author APPle
 *
 */
public class IndexServiceImpl implements IndexService {
	IndexDao dao = new IndexDaoImpl();
	
	public List<Types> queryTypes() {
		return dao.queryTypes();
	}

	public List<Books> queryBooks(String typeId) {
		return dao.queryBooks(typeId);
	}

	public Books queryBook(String id) {
		return dao.queryBook(id);
	}

}
