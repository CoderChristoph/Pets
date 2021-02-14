package com.codingdojo.web.models;

public class Dog extends Animal implements Pet {
	
	public Dog(String name, String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	public String showAffection() {
		if (this.weight <= 30) {
			return (this.name + " hopped into your lap and cuddled you!");
		} else {
			return (this.name + " curled up next to you!");
		}
	}
}
