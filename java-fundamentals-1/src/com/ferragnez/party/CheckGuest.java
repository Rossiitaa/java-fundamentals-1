package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		String[] guestList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili" };

		Scanner s = new Scanner(System.in);
		System.out.println("Tell me your name and let's see if you're on the list");
		String name = s.nextLine();

		s.close();
		boolean namePerson = false;

		for (int i = 0; i < guestList.length; i++) {
			if (name.equalsIgnoreCase(guestList[i])) {
				namePerson = true;
			}
		}
		if (namePerson) {
			System.out.println("Welcome, the ferragnez are waiting for you");
		} else {
			System.out.println("You are not on the list, go back to where you came from");
		}
	}
}
