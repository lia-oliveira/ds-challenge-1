package com.oliveiralia.simple_order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oliveiralia.simple_order.entities.Order;
import com.oliveiralia.simple_order.services.OrderService;

@SpringBootApplication
public class SimpleOrderApplication implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;
	
	public SimpleOrderApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleOrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order o1 = new Order(1034,150.00, 20.0);		
		Order o2 = new Order(2282, 800.00, 10.0);
		Order o3 = new Order(1309, 95.90, 0.0);
		
		System.out.println("Pedido código " + o1.getCode());
		System.out.println("Valor total: R$ " + orderService.total(o1));
		
		System.out.println("Pedido código " + o2.getCode());
		System.out.println("Valor total: R$ " + orderService.total(o2));
		
		System.out.println("Pedido código " + o3.getCode());
		System.out.println("Valor total: R$ " + orderService.total(o3));
	}

}
