package ch1.caelum.java.basics.model;

public class A {
	
	private String name;
	
	public A(){};
	
	A(String name){
		this.name = name;
	}
	
	public void print(){
		System.out.println(name);
	}

}
