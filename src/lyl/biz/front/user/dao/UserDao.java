package lyl.biz.front.user.dao;

import lyl.entity.Users;

public interface UserDao {
	//�����������û�����
	public Users findByName(String name);
	public Users findById(String id);
	public void save(Users user);
}
