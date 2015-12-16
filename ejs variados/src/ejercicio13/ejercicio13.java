package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        float sueldo;
        int edad;
        System.out.print("tiene un sueldo de:");
        sueldo=sc.nextFloat();
        System.out.print("tiene una edad de :");
        edad=sc.nextInt();
        if (sueldo<500 && edad>10) {
            float aumento=sueldo * 0.20f;
            float total=sueldo+aumento;
            System.out.print("le tienen que pagar:");
            System.out.print(total);
        } else {
            if (sueldo<500) {
                float aumento=sueldo * 0.05f;
                float sueldoTotal=sueldo+aumento;
                System.out.print("le tienen que pagar:");
                System.out.print(sueldoTotal);            
            } else {
            	System.out.print("le tienen que pagar:");
                System.out.print(sueldo);
            }
        }
    }

	}


