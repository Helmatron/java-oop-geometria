package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Rettangolo dati = new Rettangolo();
		
		System.out.println("Inserire la base del rettangolo");
		dati.base = input.nextInt();
		
		System.out.println("Inserire l'altezza del rettangolo");
		dati.altezza = input.nextInt();
		
		dati.StampaDati();
		

	}

}
