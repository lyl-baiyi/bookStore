package lyl.biz.front.order.service;

import java.util.List;

import lyl.entity.Orders;

public interface OrderService {
	public void saveOrder(Orders orders);
	public List<Orders> queryOrders(String userId);
}
