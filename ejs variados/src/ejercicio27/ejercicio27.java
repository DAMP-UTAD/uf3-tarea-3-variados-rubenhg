package ejercicio27;

import java.util.Scanner;

public class ejercicio27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, valor;
		System.out.print("valor entre 1 y 10:");
		valor = sc.nextInt();
		for (n = valor; n <= valor * 12; n = n + valor) {
			System.out.print(n);
			System.out.print("-");

		}
	}
}
