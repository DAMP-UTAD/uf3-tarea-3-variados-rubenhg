package ejercicio25;

import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, valor, sum;
		sum=0;
		for (n=1;n<=10;n++) {
			System.out.print("valor:");
			valor = sc.nextInt();
			if (n > 5) {
				sum=sum+valor;
			}
		}
		System.out.print("La suma es:");
		System.out.print(sum);

	}

}
