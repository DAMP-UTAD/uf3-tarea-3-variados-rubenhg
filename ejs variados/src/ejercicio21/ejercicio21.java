package ejercicio21;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n,x,valor,par,impar;
        x=1;
        par=0;
        impar=0;
        System.out.print("cantidad de numeros a ingresar:");
        n=sc.nextInt();
        while (x<=n) {
            System.out.print("valor:");
            valor=sc.nextInt();
            if (valor%2==0) {
                par=par + 1;
            } else {
                impar=impar + 1;
            }
            x=x + 1;
        }
        System.out.print(" pares:");
        System.out.println(par);
        System.out.print(" impares:");
        System.out.print(impar);

	}

}
