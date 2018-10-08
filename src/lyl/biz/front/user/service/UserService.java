package lyl.biz.front.user.service;

import lyl.entity.Users;

public interface UserService {
	public Users login(String name);
	public void register(Users user); 
}
