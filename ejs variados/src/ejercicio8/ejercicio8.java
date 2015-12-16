package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d,m;
        System.out.print("dia:");
        d=sc.nextInt();
        System.out.print("mes:");
        m=sc.nextInt(); 
        if (m==12 && d==25) {
            System.out.print("Es navidad");
        }else{
        	System.out.println("no es navidad");
        }
	}
}

