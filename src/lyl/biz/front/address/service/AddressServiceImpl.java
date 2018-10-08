package lyl.biz.front.address.service;

import java.util.List;

import lyl.biz.front.address.dao.AddressDao;
import lyl.biz.front.address.dao.AddressDaoImpl;
import lyl.entity.Address;

public class AddressServiceImpl implements AddressService {
	
	AddressDao dao = new AddressDaoImpl();
	
	public void save(Address address) {
		dao.save(address);
	}
	
	public List<Address> queryAddress(String userId){
		return dao.queryAddress(userId);
	}

}
