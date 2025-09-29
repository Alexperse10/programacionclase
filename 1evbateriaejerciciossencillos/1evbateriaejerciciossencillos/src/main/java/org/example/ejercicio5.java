package org.example;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        double numero1 = sc.nextDouble();
        System.out.println("introduce un segundo numero");
        double numero2 = sc.nextDouble();

        if (numero2 == 0){
            System.out.print("el numero es incorrecto, introduzca un numero diferente de cero");
        }else {
            double dividir = numero1 / numero2;
            System.out.println("el resultado de la division es: "+dividir);
        }
    }
}
