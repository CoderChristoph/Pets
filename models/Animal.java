package com.codingdojo.web.models;

public class Animal {
	protected String name;
	protected String breed;
	protected int weight;
	
	public Animal() {
		this.name = "default";
		this.breed = "default";
		this.weight = 0;
	}
	
	public Animal(String name) {
		this.name = name;
		this.breed = "default";
		this.weight = 0;
	}
	
	public Animal(String name, String breed) {
		this.name = name;
		this.breed = breed;
		this.weight = 0;
	}
	
	public Animal(String name, String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
}
