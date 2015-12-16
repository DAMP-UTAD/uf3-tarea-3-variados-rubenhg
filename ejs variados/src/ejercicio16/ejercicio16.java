package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,x;
	float oper = 0;
	float altura;
	System.out.print("¿Cuantas alturas hay?:");
	n=sc.nextInt();
	x=1;
	while (x<=n) {
		System.out.print("ingrese altura:");
		altura=sc.nextFloat();
		oper=oper+altura;
		x=x+1;
	}
	oper=oper/n;
	System.out.print("la altura media es:");
	System.out.print(oper);
	}

}
