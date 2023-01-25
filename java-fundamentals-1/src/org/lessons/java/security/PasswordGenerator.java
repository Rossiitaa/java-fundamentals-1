package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Inserisci il tuo nome");
		String name = s.nextLine();

		System.out.println("Inserisci il tuo cognome");
		String surname = s.nextLine();

		System.out.println("Inserisci il tuo colore preferito");
		String color = s.nextLine();

		System.out.println("Inserisci il giorno in cui sei nato");
		int day = s.nextInt();

		System.out.println("Inserisci il mese in cui sei nato");
		int month = s.nextInt();

		System.out.println("Inserisci l'anno in cui sei nato");
		int year = s.nextInt();

		int resultDateOfBirth = day + month + year;

		String password = name + "-" + surname + "-" + color + "-" + resultDateOfBirth;

		System.out.println("La tua password é : " + password);

		s.close();
	}
}
