package org.example;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("el numero es positivo");

        } else if (numero < 0) {
            System.out.println("el numero es negativo");

        } else {
            System.out.println("el numero es cero y es natural");
        }if (numero == 0){ //opcion dos
            System.out.println("el numero es natural");
        } else if (numero>0) {
            System.out.println("el numero es positivo");

        }else {
            System.out.println("el numero es negativo");
        }
    }



}
