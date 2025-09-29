package org.example;

import java.util.Scanner;

public class ejercicio5mas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividendo;
        double divisor;

        do {
            System.out.println("introducir el dividendo");
            dividendo = sc.nextDouble();
           System.out.println("introducir el divisor");
            divisor = sc.nextDouble();

            if (divisor == 0){
                System.out.println("error introduce un numero diferente de cero");
            }
        }while (divisor ==0) ;
        double dividir = dividendo / divisor;
        System.out.println("el resultado de la division es: "+dividir );
    }
}
