package org.lessons.java.geometria;

import java.util.Scanner;

public class Rettangolo {

	public int base;
	public int altezza;

	// Creo un costruttore senza parametri per far inizializzare l'oggetto
	// direttamente dall'utente con input tastiera.
	public Rettangolo() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci la base del rettangolo");
		base = scanner.nextInt();

		System.out.println("Inserisci l'altezza del rettangolo");
		altezza = scanner.nextInt();

		scanner.close();
	}

	// Creo un metodo che ritorna il valore di calcolo dell'area
	public int calcolaArea() {
		return this.base * this.altezza;
	}

	// Creo un metodo che ritorna il valore di calcolo dell perimetro
	public int calcolaPerimetro() {
		return (this.base * 2) + (this.altezza + 2);
	}

	/*
	 * << METODO 1 >> int base; int altezza;
	 * 
	 * public void StampaDati() { int area = base * altezza; int perimetro = (base *
	 * 2) + (altezza * 2); System.out.println("L'area del rettangolo è " + area);
	 * System.out.println("Il perimetro del rettangolo è " + perimetro);
	 */
}