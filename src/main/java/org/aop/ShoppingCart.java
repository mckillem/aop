package org.aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	public void checkout(String parameter) {
		//Logging
		//Authentication and authorization
		//Sanitize the data
		System.out.println("checkout method");
	}

	public int quantity() {
		return 34;
	}
}
