package com.basic;

import java.io.File;
import java.io.FilenameFilter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OuterClass {

	private static String name = "OuterClass";
	private int i;
	protected int j;
	int k;
	public int l;
	
	public OuterClass(int i, int j, int k, int l) {
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
	}
	
	static class StaticNestedClass{
		private int a;
		protected int b;
		int c;
		public int d;
		
		public int getA(){
			return this.a;
		}
		
		public int getB(){
			return this.b;
		}
		
		public String getName(){
			return name;
		}
	} //static nested class

	public static String getName() {
		return name;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	public int getK() {
		return k;
	}

	public int getL() {
		return l;
	}

	//inner class, non-static and can access all the variables/methods of outer class
	class InnerClass{
		
		private int w;
		protected int x;
		int y;
		public int z;
		
		public int getW(){
			return this.w;
		}
		
		public void setValues(){
			this.w = i;
			this.x = j;
			this.y = k;
			this.z = l;
		}

		@Override
		public String toString() {
			return "InnerClass [w=" + w + ", x=" + x + ", y=" + y + ", z=" + z
					+ "]";
		}
		
		public String getName(){
			return name;
		}
		
	}	//inner class
	
	//local inner class - class inside a method
	
	public void print(String str){
		
		class Logger{
			
			String name;
			
			public Logger(String name){
				this.name = name;
			}
			
			public void log(String str){
				System.out.println(this.name + " : "+ str);
			}
			
		} // inner class
		
		Logger logger = new Logger(str);
		logger.log(name);
		logger.log("" + this.i);
	}
	
	//anonymous inner class
	public String[] getFilesInDir(String dir, final String ext){
		File file = new File(dir);
		
		
		String[] files = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(ext);	
			}
		}) ;
				
		return files;
	}
	
	
}
