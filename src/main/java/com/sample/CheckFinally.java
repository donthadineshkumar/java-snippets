package com.sample;

public class CheckFinally {

	public static void main(String[] args) {
		
		try{
			System.out.println("I am in heaven");
			//with System.exit(int) call - finally won't execute.
			System.exit(0);
		}finally{
			System.out.println("I am in finally");
		}
		
	}
	
}
