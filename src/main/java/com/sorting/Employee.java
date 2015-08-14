package com.sorting;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private int age;
	private long salary;

	public Employee(int id, String name, int age, long salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee emp) {
		/*
		 * lets sort the employee based on id in ascending order
		 * returns a negative integer, zero, or a positive integer
		 * as this employee id is less than, equal to, or greater than
		 * the specified object.
		 */
	//this is comparing based on id	
		//return (this.id - emp.id);
		
		//compare the salaries
		return (int) (emp.salary - this.salary);
		
	}
	
	
	@Override
	public String toString() {
		return "[id= "+ this.id +
				  	 ", name =" + this.name +
				  	 ", age= "+this.age +
				  	 ", salary = "+ this.salary +
				  	 " ]";
	}

	
	
	

}
