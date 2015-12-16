package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float num;
	System.out.println("el numero es: ");
	num=sc.nextInt();
	if (num>=10) {
		System.out.println("es un numero de 2 digitos");
	} else if (num<10){
		System.out.println("es un numero de un digito");
	}else{
		System.out.println("tiene mas de dos digitos");
	}
	}

}
