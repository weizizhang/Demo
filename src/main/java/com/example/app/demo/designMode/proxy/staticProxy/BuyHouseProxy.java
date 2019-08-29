package com.example.app.demo.designMode.proxy.staticProxy;

public class BuyHouseProxy implements BuyHouse {

	private BuyHouse buyHouse;

	public BuyHouseProxy(final BuyHouse buyHouse) {
		this.buyHouse = buyHouse;
	}
	
	@Override
	public void buy() {
		System.out.println("execute impl");
		buyHouse.buy();
	}

}
