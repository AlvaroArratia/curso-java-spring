package com.codingdojo.web.models;

public class Dog extends Animal implements Pet {

	@Override
	public String showAffection() {
		String reaction = "";
		if (this.weight < 30) {
			reaction = this.name + " hopped into your lap and cuddled you!";
		} else if (this.weight >= 30) {
			reaction = this.name + " curl up next to you!";
		}
		return reaction;
	}
}
