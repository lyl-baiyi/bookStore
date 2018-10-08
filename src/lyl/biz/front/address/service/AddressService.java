package lyl.biz.front.address.service;

import java.util.List;

import lyl.entity.Address;

public interface AddressService {
	public void save(Address address);
	public List<Address> queryAddress(String userId);
}
