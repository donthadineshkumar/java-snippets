package com.scanner;

/*
 * Stream objects that implement formatting are instances of either
 * PrintWriter, a character stream class
 * PrintStream, a byte stream class
 * 
 * When you need a formatted output stream, instanitiate 
 * PrintWriter, not PrintStream
 * 
 * format : formats almost anu number of values based 
 * on a format string, with many options for 
 * precise formatting
 * 
 */
public class FormattedOutput {
	
	public static void main(String[] args) {
		
		int i=2;
		double r = Math.sqrt(i);
		//for format - dont use the concatenation operator + use ,
		System.out.format("The square root of %d is %f.%n", i, r);
		
		System.out.format(" %f ,%<+025.20f %n",Math.PI);
		
		System.out.format("%f, %1$+020.10f %n", Math.PI);
		
		/*
		 * % begin format specifiers
		 * 1$ arugument index or <
		 * flags -other formatting options ( + -  ,)
		 * number should be formatted with a sign
		 * + indicates a flag +0 here 0 is the padding character
		 * + on left
		 * -on right
		 */
	}

}
