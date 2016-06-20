package com.dwr;

 
public class HelloWorld {
	private String name;
	public HelloWorld(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String sayHello(String name) {
        return "Hello, " + name;
    }

}