package org.lessons.java.security;

import java.util.Scanner;

public class sondaggioOS {
	public static void main(String[] args) {
		int studentsNumber;
		int windowsStudents;
		int macOSstudents;
		int linuxStudents;

		Scanner s = new Scanner(System.in);

		System.out.println("Quanti studenti ci sono nella tua scuola?");
		studentsNumber = s.nextInt();

		System.out.println("Quanti studenti usano windows?");
		windowsStudents = s.nextInt();

		System.out.println("Quanti studenti usano macOS?");
		macOSstudents = s.nextInt();

		System.out.println("Quanti studenti usano Linux?");
		linuxStudents = s.nextInt();

		double percentualeStudentiWindows = (windowsStudents * 100) / studentsNumber;
		double percentualeStudentiMacOS = (macOSstudents * 100) / studentsNumber;
		double percentualeStudentiLinux = (linuxStudents * 100) / studentsNumber;

		System.out.println("La percentuale di studenti che utilizza windows è: " + percentualeStudentiWindows + "%");
		System.out.println("La percentuale di studenti che utilizza macOS è: " + percentualeStudentiMacOS + "%");
		System.out.println("La percentuale di studenti che utilizza Linux è: " + percentualeStudentiLinux + "%");

	}
}
