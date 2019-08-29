package com.example.app.demo.designMode.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {

	private Object object;
	
	public DynamicProxyHandler(final Object object) {
		this.object = object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(object, args);
		return result;
	}

}
