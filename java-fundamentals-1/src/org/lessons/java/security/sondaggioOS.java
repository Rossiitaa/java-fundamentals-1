package org.lessons.java.security;

import java.util.Scanner;

public class sondaggioOS {
	public static void main(String[] args) {
		int studentsNumber;
		short windowsStudents;
		short macOSstudents;
		short linuxStudents;

		Scanner s = new Scanner(System.in);

		System.out.println("Quanti studenti ci sono nella tua scuola?");
		studentsNumber = s.nextInt();

		System.out.println("Quanti studenti usano windows?");
		windowsStudents = s.nextShort();

		System.out.println("Quanti studenti usano macOS?");
		macOSstudents = s.nextShort();

		System.out.println("Quanti studenti usano Linux?");
		linuxStudents = s.nextShort();

		int percentualeStudentiWindows = (windowsStudents * 100) / studentsNumber;
		int percentualeStudentiMacOS = (macOSstudents * 100) / studentsNumber;
		int percentualeStudentiLinux = (linuxStudents * 100) / studentsNumber;

		System.out.println("La percentuale di studenti che utilizza windows è: " + percentualeStudentiWindows + "%");
		System.out.println("La percentuale di studenti che utilizza macOS è: " + percentualeStudentiMacOS + "%");
		System.out.println("La percentuale di studenti che utilizza Linux è: " + percentualeStudentiLinux + "%");

	}
}
