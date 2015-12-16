package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("primer numero:");
        n1=sc.nextInt();
        System.out.print("segundo numero:");
        n2=sc.nextInt();
        System.out.print("tercer numero:");
        n3=sc.nextInt();
        System.out.print("el menor es:");
        if (n1<n2 && n1<n3) {
            System.out.println(n1);
        } else {
            if (n2<n3) {
                System.out.println(n2);
            } else {
                System.out.println(n3);
            }
        }
        
        System.out.print("el mayor es:");
        if (n1>n2 && n1>n3) {
            System.out.print(n1);
        } else {
            if (n2>n3) {
                System.out.print(n2);
            } else {
                System.out.print(n3);
            }
            
        }

	}

}
