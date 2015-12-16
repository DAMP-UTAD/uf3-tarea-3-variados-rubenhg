package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota, x, mayor = 0, menor = 0;
		x = 1;
		while (x <= 10) {
			System.out.print("nota:");
			nota = sc.nextInt();
			if (nota >= 7) {
				mayor = mayor + 1;
			} else {
				menor = menor + 1;
			}
			x = x + 1;
		}
		System.out.print("Las notas mayores son:");
		System.out.println(mayor);
		System.out.print("las notas menores son:");
		System.out.print(menor);
	}
}
