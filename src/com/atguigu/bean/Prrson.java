package com.atguigu.bean;

public class Prrson {
	private String name;
	private int age;
	private char gender;
	@Override
	public String toString() {
		return name+age;
	}
	public Prrson(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	
}
