package com.singleton.main;

public class SingleParent {

	private String str = "";
	
	private static volatile SingleParent singleParentObj = null;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	protected SingleParent(){
		
	}
	
	public static SingleParent getSingleParentObject(){
		
		if(singleParentObj == null){
			singleParentObj = new SingleParent();
		}
		return singleParentObj;
	}
}
