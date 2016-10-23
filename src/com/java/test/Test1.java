package com.java.test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		a = a + b; 
		b = a - b; 
		a = a - b;
		System.out.println(a+"----"+b);
		Parent p = new Child1();
		Parent parent = new Parent();
		p.show();
		parent.show();
	}

}
