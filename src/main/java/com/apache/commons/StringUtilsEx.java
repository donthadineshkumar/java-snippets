package com.apache.commons;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsEx {
	
	public static void main(String[] args) {
/*
			//lang3 has a field SPACE - represents a space character
			System.out.println("Dinesh"+StringUtils.SPACE+"Dontha");
			
			//lang3 has a field CR  carriage return ("\r")
			System.out.println("Dinesh"+StringUtils.CR+"Dontha");
			
			//lang3 has a field LF -line feed - represents a line feed ("\n")
			System.out.println("Dinesh"+StringUtils.LF+"Dontha");*/
	/*		
			//
			System.out.println(StringUtils.abbreviate(null, 1));
			System.out.println(StringUtils.abbreviate("", 4));
			//abc...
			System.out.println(StringUtils.abbreviate("abcdefg", 6));
			//for a 8-lter word - 7,8 maxWdith - no abbr
			System.out.println(StringUtils.abbreviate("abcdefg", 7));
			System.out.println(StringUtils.abbreviate("abcdefg", 8));
			System.out.println(StringUtils.abbreviate("abcdefg", 4));*/
			
			
			System.out.println(StringUtils.abbreviate("abcdefghijklmno", -1, 10));
			System.out.println(StringUtils.abbreviate("abcdefghijklmno", 0, 10));
			System.out.println(StringUtils.abbreviate("abcdefghijklmno", 1, 10));
			System.out.println(StringUtils.abbreviate("abcdefghijklmno", 4, 10));
			System.out.println(StringUtils.abbreviate("abcdefghijklmno", 5, 10));
			System.out.println(StringUtils.abbreviate("abcdefghijklmno", 6, 10));
			System.out.println(StringUtils.abbreviate("abcdefghijklmno", 8, 10));
			System.out.println(StringUtils.abbreviate("abcdefghijklmno", 10, 10));
			System.out.println(StringUtils.abbreviate("abcdefghijklmno", 12, 10));
			
	}
}
