package com.example.app.demo.designMode.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

import com.example.app.demo.designMode.proxy.staticProxy.BuyHouse;
import com.example.app.demo.designMode.proxy.staticProxy.BuyHouseImpl;

public class DynaminProxyTest {
	public static void main(String[] args) {
		BuyHouse buyHouse = new BuyHouseImpl();
		BuyHouse buyHouseProxy = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), 
				new Class[] {BuyHouse.class}, 
				new DynamicProxyHandler(buyHouse));
		buyHouseProxy.buy();
	}
}
