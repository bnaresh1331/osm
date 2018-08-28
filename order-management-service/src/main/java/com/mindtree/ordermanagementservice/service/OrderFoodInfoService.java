package com.mindtree.ordermanagementservice.service;

import java.util.List;

import com.mindtree.ordermanagementservice.model.OrderFoodInfo;

public interface OrderFoodInfoService {

	public OrderFoodInfo create(OrderFoodInfo orderFoodInfo);
	public List<OrderFoodInfo>getListOfFoodItemsOrder(int orderId);
	

}
