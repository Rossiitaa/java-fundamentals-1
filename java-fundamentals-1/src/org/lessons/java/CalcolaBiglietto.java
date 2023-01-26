package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Inserisci numero di km: ");
		int userKm = s.nextInt();
		if (userKm < 0) {
			System.out.println("Inserire un valore positivo");
			return;
		}

		System.out.print("Inserisci l'età: ");
		int userAge = s.nextInt();
		if (userAge < 0) {
			System.out.println("Inserire un valore positivo");
			return;
		}

		s.close();

		double ticketPrice = ((double) userKm) * 0.21;

		if (userAge < 18) {
			ticketPrice = ticketPrice * 0.8;
			System.out.println("Sconto del 20% per i minorenni");
		} else if (userAge > 65) {
			ticketPrice = ticketPrice * 0.6;
			System.out.println("Sconto del 40% per gli over 65");
		}

		String ticketFormat = String.format("%.2f", ticketPrice);

		System.out.println("Ecco il prezzo del biglietto: " + ticketPrice + "€");
	}
}
