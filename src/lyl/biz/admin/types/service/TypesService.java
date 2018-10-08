package lyl.biz.admin.types.service;

import lyl.entity.Types;

import java.util.List;

public interface TypesService {
	public List<Types> queryTypes();
	public void saveTypes(Types type);
}
