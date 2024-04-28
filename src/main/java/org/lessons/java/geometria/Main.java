package org.lessons.java.geometria;

public class Main {

	public static void main(String[] args) {

		// Invoco la classe Rettangolo
		Rettangolo rettangolo = new Rettangolo();

		// Invoco i metodi che ritornano i valori di Area e Perimetro
		System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
		System.out.println("Il perimetro del rettangolo è: " + rettangolo.calcolaPerimetro());

		/*
		 * << METODO 1 >> Scanner input = new Scanner(System.in);
		 * 
		 * Rettangolo dati = new Rettangolo();
		 * 
		 * System.out.println("Inserire la base del rettangolo"); dati.base =
		 * input.nextInt();
		 * 
		 * System.out.println("Inserire l'altezza del rettangolo"); dati.altezza =
		 * input.nextInt();
		 * 
		 * dati.StampaDati();
		 */
	}
}