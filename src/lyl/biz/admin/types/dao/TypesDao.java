package lyl.biz.admin.types.dao;

import lyl.entity.Types;

import java.util.List;

public interface TypesDao {
	public List<Types> findAll();
	//��ӷ���
	public void saveTypes(Types type);
}
