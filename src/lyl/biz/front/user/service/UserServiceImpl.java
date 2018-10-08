package lyl.biz.front.user.service;

import lyl.biz.front.user.dao.UserDao;
import lyl.biz.front.user.dao.UserDaoImpl;
import lyl.entity.Users;

public class UserServiceImpl implements UserService {
	UserDao dao = new UserDaoImpl(); 
	
	public Users login(String name) {
		return dao.findByName(name);
	}

	public void register(Users user) {
		dao.save(user);
	}

}
