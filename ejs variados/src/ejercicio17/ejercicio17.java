package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n,x,conta1,conta2;
        float gastos,sueldo;
        System.out.print("Cuantos empleados tiene la empresa:");
        n=sc.nextInt();
        x=1;
        gastos=0;
        conta1=0;
        conta2=0;
        
        while (x<=n) {
            System.out.print(" sueldo empleado:");
            sueldo=sc.nextFloat();
            if (sueldo<=300) {
                conta1=conta1 + 1;
            } else {
            	conta2=conta2 + 1;
            }
            gastos=gastos+sueldo;
            x=x + 1;
        }
        System.out.print("empleados con sueldo de 100 y 300:");
        System.out.println(conta1);
        System.out.print("empleados con sueldo superior a 300:");
        System.out.println(conta2);
        System.out.print("Ggastos en sueldos de la empresa:");
        System.out.println(gastos);

	}

}
