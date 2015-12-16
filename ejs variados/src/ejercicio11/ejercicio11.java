package ejercicio11;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("primer numero: ");
		n1=sc.nextInt();
		System.out.println("segundo numero: ");
		n2=sc.nextInt();
		System.out.println("tercer numero: ");
		n3=sc.nextInt();
		if (n1<10 || n2<10 || n3<10) {//or
			System.out.println("alguno de los numeros es menor a 10");
		} else {
			System.out.println("No hay numeros menores a 10");
		}
	}

}
	


