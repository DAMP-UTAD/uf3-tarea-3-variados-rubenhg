package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,suma,resta,producto,div;
		System.out.println("primer numero: ");
		num1=sc.nextInt();
		System.out.println("segundo numero: ");
		num2=sc.nextInt();
		
		if (num1>num2) {
			suma = num1+num2;
			resta=num1-num2	;
			System.out.println("la suma es: " + suma);
			System.out.println("la resta es: " + resta);
		} else {
			producto=num1*num2;
			div=num1%num2;
			System.out.println("el producto es: " + producto);
			System.out.println("la division es: " + div);
		}
		
	}

}
