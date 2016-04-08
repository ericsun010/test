package com.jike.spring.chapter01;

public class Person {
	private IHelloMessage helloMessage;

	public IHelloMessage getHelloMessage() {
		return helloMessage;
	}

	public void setHelloMessage(IHelloMessage helloMessage) {
		this.helloMessage = helloMessage;
	}
	
	public String sayHellow(){
		return this.helloMessage.sayHello();
	}
}
