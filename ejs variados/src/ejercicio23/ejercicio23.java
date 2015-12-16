package ejercicio23;

import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int cuenta;
        float saldo,sum;
        sum=0;
        do {
            System.out.print(" número  cuenta:");
            cuenta=sc.nextInt();
            if (cuenta>=0) {
                System.out.print(" saldo:");
                saldo=sc.nextFloat();
                if (saldo>0) {
                    System.out.println("saldo acredor.");
                    sum=sum+saldo;
                } else {
                    if (saldo<0) {
                        System.out.println("saldo deudor.");
                    } else {
                        System.out.println("saldo nulo");
                    }
                }
            }
        } while(cuenta>=0);
        System.out.print("total de saldos :");
        System.out.print(sum);

	}

}
