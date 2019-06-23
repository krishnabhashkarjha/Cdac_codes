package com.met.training;

import java.util.List;

public class JavaTrainer implements Trainer{

	private String name;
	private List<String> subjects;
	
	public JavaTrainer(String name, List<String> subjects) {
		this();
		this.name = name;
		this.subjects = subjects;
	}

	public JavaTrainer() {
		super();
		
		System.out.println("Java Trainer created");
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}


	@Override
	public void train() {
		
		System.out.println(name + " is teaching on java subjects " + subjects);
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " is a Java Trainer";
	}
	
}

