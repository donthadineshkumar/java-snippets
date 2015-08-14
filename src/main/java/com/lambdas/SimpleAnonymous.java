package com.lambdas;

public class SimpleAnonymous {

	public static void main(String a[]) {
		
	//without lambda expressions - need an anonymous inner type
		
		
		
		StringToIntMapper mapper = new StringToIntMapper() {
		
		@Override
		public int map(String name) {
			return name.length();
		}
	};
	
	String name="dinesh";
	int mappedValue = mapper.map(name);
	System.out.println("name="+name+" , mapped value="+mappedValue);
	}
}
