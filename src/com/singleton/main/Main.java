package com.singleton.main;

import java.io.ObjectInputStream.GetField;

public class Main {

	public static void main(String... w){
		SingleParent s1 = SingleParent.getSingleParentObject();
		s1.setStr("one");
		
		System.out.println("S1 : "+s1.getStr());
		
		SingleParent s2 = SingleParent.getSingleParentObject();
		
		if(s2.getStr()!=null){
			System.out.println("S2 : "+s2.getStr());
		}
		
		s2.setStr("two");
		
		System.out.println("S1 : "+s1.getStr());
		System.out.println("S2 : "+s2.getStr());
		System.out.println("/////////////////////////////////");
		
		A a = new A();
		a.setStr("A set");
		
		B b = new B();
		System.out.println("b: " + s1.getStr());
		
		
		
	}
	
}
