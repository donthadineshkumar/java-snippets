package com.regex;

public class Split {

	public static void main(String[] args) {
		
	      String tokens[]  =null;

	      String statement= "compromise|cooperate|concession|"+
	      "conciliation|(finding the middle group)|(give and take)";

	      tokens=statement.split("\\|");

	      System.out.println("REGEX PATTERN:\n"+statement + "\n");

	      System.out.println("TOKENS:");
	      for (int i=0; i < tokens.length; i++){
	      System.out.println(tokens[i]);
	      }
	      
	      
	      String replaced =statement.replaceAll("co","pro");
	      System.out.println("replaced text "+replaced);
	      
		
	      String phrase ="but simple justice, not charity";
	      
	      String[] toks = phrase.split(",");
	      
	      for(String t: toks){
	    	  System.out.println(t);
	      }
	      
	}
	
}
