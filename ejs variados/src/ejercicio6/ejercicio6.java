package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.print("el numero es:");
		n = teclado.nextInt();
		if (n < 10) {
			System.out.print("Tiene un dígito");
			} else {
			if (n < 100) {
			System.out.print("Tiene dos dígitos");
			} else {
			if (n < 1000) {
				System.out.print("Tiene tres dígitos");
			} else {
				System.out.print("Error ");
			}
		}
	}
}
}
