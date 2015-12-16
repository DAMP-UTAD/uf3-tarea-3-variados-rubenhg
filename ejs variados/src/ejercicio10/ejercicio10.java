package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("primer numero: ");
		n1=sc.nextInt();
		System.out.println("segundo numero: ");
		n2=sc.nextInt();
		System.out.println("tercer numero: ");
		n3=sc.nextInt();
		if (n1<10 && n2<10 && n3<10) {
			System.out.println("Todos los numeros son menores a 10");
		} else {
			System.out.println("No todos son menores a 10");
		}
	}

}
