package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x,y;
	System.out.println("las coordenadas son: ");	
	System.out.println("coordenada en X: " );
	x=sc.nextInt();	
	System.out.println("coordenada en Y: " );
	y=sc.nextInt();
	if (x>0 && y>0) {
		System.out.println("el vector se encuentra en el primer cuadrante");
	} else {
		if (x<0 && y>0) {
			System.out.println("el vector esta en el segundo cuadrante");
		} else {
			if (x<0 && y<0) {
				System.out.println("el vector eta en el tercer cuadrante");
			} else {
				System.out.println("el vector esta en el cuarto cuadrante");
			}
		}
	}
	}
}
