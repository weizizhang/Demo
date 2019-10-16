package com.example.app.demo.designMode.template;

public class OccCheckProcess extends CertCheckAbstractClass {

	@Override
	public boolean isSwitchOn(String id) {
		System.out.println("判断开关是否打开");
		return "1001".equals(id);
	}

	@Override
	public boolean needCheck(String id) {
		System.out.println("判断是否需要检查");
		return "1001".equals(id);
	}

	@Override
	public void check(String id) {
		System.out.println("执行具体的检查流程");
		System.out.println("当前输入ID："+id);
	}

}
