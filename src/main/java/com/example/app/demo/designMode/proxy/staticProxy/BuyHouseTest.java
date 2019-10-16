package com.example.app.demo.designMode.proxy.staticProxy;

public class BuyHouseTest {
	
	public static void main(String[] args) {
		BuyHouse buyHouse = new BuyHouseImpl();
		BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
		buyHouseProxy.buy();
	}
}
