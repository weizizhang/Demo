package com.example.app.demo.designMode.template;

public abstract class CertCheckAbstractClass {
	//模板方法
	public void mainProcess(String id) {
		if(isSwitchOn(id) && needCheck(id)) {
			check(id);
		}
	}
	//检查开关是否打开
	public abstract boolean isSwitchOn(String id);
	//判断是否需要检查当前单证
	public abstract boolean needCheck(String id);
	//具体检查方法
	public abstract void check(String id);
	
}
