package lyl.biz.front.order.service;

import java.util.List;

import lyl.biz.front.order.dao.OrderDao;
import lyl.biz.front.order.dao.OrderDaoImpl;
import lyl.entity.Orders;

public class OrderServiceImpl implements OrderService {
	OrderDao dao = new OrderDaoImpl();
	public void saveOrder(Orders orders) {
		dao.saveOrder(orders);
	}
	public List<Orders> queryOrders(String userId) {
		return dao.queryOrders(userId);
	}

}
