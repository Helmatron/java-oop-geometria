package org.lessons.java.geometria;

import java.util.Scanner;

public class Rettangolo {
	
	int base;
	int altezza;
	
	public void StampaDati() {
		int area = base * altezza;
		int perimetro = (base * 2) + (altezza * 2);
		System.out.println("L'area del rettangolo è " + area);
		System.out.println("Il perimetro del rettangolo è " + perimetro);

	 }
}