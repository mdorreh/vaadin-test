package com.mycompany.vaadin_app;

public class Employee implements IEmployee {
	String name;
	String password;
	int number;
	
	
	@Override
	public void setUsername(String name) {
		this.name=name;
	}
	@Override
	public void setPassword(String password) {
		this.password=password;
	}
	@Override
	public int numberOfLoginClick() {
		return number;
	}
	public void setNumber(int number) {
		this.number=number;
	}

}
