package com.codingdojo.web.models;

public class Cat extends Animal implements Pet {
	
	public Cat(String name, String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	public String showAffection() {
		return ("Your " + this.breed + ", " + this.name + ", " + "looked at you with some affection. You think!");
	}
}
