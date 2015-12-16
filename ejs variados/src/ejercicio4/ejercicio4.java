package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	int num1,num2,num3;
	System.out.println("primer numero");
	num1=sc.nextInt();
	System.out.println("segundo numero");
	num2=sc.nextInt();
	System.out.println("tercero numero");
	num3=sc.nextInt();
	if (num1>num2) {
		System.out.println("el mayor es: " + num1);
	} else if (num2>num3){
		System.out.println("el mayor es: " + num2);
	}else if(num3>num1){
		System.out.println("el mayor es: " + num3);
	}
	}
}

