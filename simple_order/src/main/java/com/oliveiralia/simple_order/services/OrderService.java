package com.oliveiralia.simple_order.services;


import org.springframework.stereotype.Service;

import com.oliveiralia.simple_order.entities.Order;



@Service
public class OrderService {
	
	private ShippingService shippingService;	
	

	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	

	public double total(Order order) {
		return order.getBasic() - (order.getBasic() * order.getDiscount()/100) + shippingService.shipment(order);	
	}
	

}
