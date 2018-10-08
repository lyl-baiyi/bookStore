package lyl.biz.admin.types.service;

import lyl.biz.admin.types.dao.TypesDao;
import lyl.biz.admin.types.dao.TypesDaoImpl;
import lyl.entity.Types;

import java.util.List;

public class TypesServiceImpl implements TypesService {
	TypesDao dao = new TypesDaoImpl();
	
	public List<Types> queryTypes() {
		return dao.findAll();
	}

	public void saveTypes(Types type) {
		dao.saveTypes(type);
	}

}
