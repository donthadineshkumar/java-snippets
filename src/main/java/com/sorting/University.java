package com.sorting;

public class University {

	private int id;
	private String name;
	private int rank;
		
	
	public University() {
	}

	public University(int id, String name, int rank) {
		this.id = id;
		this.name = name;
		this.rank = rank;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", rank=" + rank
				+ "]";
	}
	
}
