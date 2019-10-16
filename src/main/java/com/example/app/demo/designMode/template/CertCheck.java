package com.example.app.demo.designMode.template;

public class CertCheck {
	public static void main(String[] args) {
		CertCheckAbstractClass certCheck = new OccCheckProcess();
		certCheck.mainProcess("1001");
	}
}
