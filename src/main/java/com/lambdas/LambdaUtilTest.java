package com.lambdas;

public class LambdaUtilTest {

	public static void main(String a[]) {
		
		LambdaUtil lu = new LambdaUtil();
		
		lu.testAdder((x,y) -> x+y);
		
		lu.testJoiner((x,y) -> x+y);
		//the joiner will a space between the two strings
		lu.testJoiner((x,y) -> x+" "+y);
		
		lu.testJoiner((x,y) -> {
			StringBuilder sbx = new StringBuilder(x);
			StringBuilder sby = new StringBuilder(y);
			sby.reverse().append(",").append(sbx.reverse());
			return sby.toString();
		});
	}
}
