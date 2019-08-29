package com.example.app.demo.designMode.proxy.staticProxy;

import org.springframework.beans.factory.annotation.Autowired;

public class BuyHouseProxy implements BuyHouse {

	private final BuyHouse buyHouse;

	@Autowired
	public BuyHouseProxy(BuyHouse buyHouse) {
		this.buyHouse = buyHouse;
	}
	
	@Override
	public void buy() {
		System.out.println("execute impl");
		buyHouse.buy();
	}

}
