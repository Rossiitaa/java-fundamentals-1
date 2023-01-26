package org.lessons.java;

public class CibiPreferiti {
	public static void main(String[] args) {

		String[] favoriteFoods = { "Pizza", "Genovese", "Gnocchi alla sorrentina", "Fiorentina", "Calamarata",
				"Astice" };

		System.out.println("Ranking length: " + favoriteFoods.length);

		System.out.println("In first place: " + favoriteFoods[2]);

		System.out.println("In last place: " + favoriteFoods[4]);

		System.out.println("The mid-ranking food: " + favoriteFoods[3]);
	}
}
