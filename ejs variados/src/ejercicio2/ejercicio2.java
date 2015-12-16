package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	int num1,num2,num3,promedio;
	System.out.println("primer numero: ");
	num1=sc.nextInt();
	System.out.println("segundo numero: ");
	num2=sc.nextInt();
	System.out.println("tercero numero: ");
	num3=sc.nextInt();
	promedio=(num1+num2+num3)/3;
	System.out.println("la nota media es de: " + promedio);
	if (promedio>=7) {
		System.out.println("promocionado");
	} else {
		System.out.println("no promocionado");
	}
	}

}
