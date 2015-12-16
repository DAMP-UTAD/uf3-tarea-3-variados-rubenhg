package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n1,n2,n3,operacion;
	System.out.println("primer numero: ");
	n1=sc.nextInt();
	System.out.println("segundo numero: ");
	n2=sc.nextInt();
	System.out.println("tercer numero: ");
	n3=sc.nextInt();
	if (n1==n2 && n1==n3 && n2==n3) {
		System.out.println("son iguales");
		operacion=(n1+n2)*n3;
		System.out.println("operacion: " + operacion);
		
	} else {
		System.out.println("no son iguales");
	}
	}
}