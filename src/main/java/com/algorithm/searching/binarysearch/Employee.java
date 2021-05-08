package com.algorithm.searching.binarysearch;

public class Employee {
	public Integer  getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer  getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int id;
	private int manager_id;
	private String name;
	
	public Employee(int id, int manager_id, String name){
		this.id = id;
		this.manager_id = manager_id;
		this.name = name;
	}
}
