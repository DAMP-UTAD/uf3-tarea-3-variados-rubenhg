package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Preguntas, Correctas;
		System.out.print("numero de preguntas:");
	Preguntas = sc.nextInt();
		System.out.print("correctas:");			
		Correctas=sc.nextInt();
		int porcentaje=Correctas * 100 / Preguntas;
		if (porcentaje>=90) {
			System.out.print("Nivel máximo");
		} else {
			if (porcentaje>=75) {
				System.out.print("Nivel medio");
			} else {
				if (porcentaje>=50) {
					System.out.print("Nivel regular");
				} else {
					System.out.print("Fuera del nivel");
				}
			}
		}
	}
}
