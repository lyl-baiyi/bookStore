package lyl.biz.front.address.dao;

import lyl.entity.Address;

import java.util.List;

public interface AddressDao {
	
	public void save(Address address);
	//�����û�id��ѯ��ַ�б�
	public List<Address> queryAddress(String userId);
}
