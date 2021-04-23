package com.doudsystems.prsdb1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/orders")
public class OrdersController {
	
	@Autowired
	private OrdersRepository ordersRepository;
	
	public @ResponseBody Iterable<Orders> GetAllOrders() {
		return ordersRepository.findAll();
	}

}
