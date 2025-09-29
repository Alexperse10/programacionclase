package org.example;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double area;
        do {
            System.out.println("introduce el valor base");
            base = sc.nextDouble();
            if (base<=0){
                System.out.println("error: la base tiene que ser mayor que cero");

            }

        }while (base<=0);
        do {
            System.out.println("introduce el valor altura");
            altura = sc.nextDouble();
            if (altura<=0){
                System.out.println("error: la altura tiene que ser mayor que cero");
            }
        }while (altura<=0);
        area = (base * altura)/2;
        System.out.println("el area es: " +area);
    }
}
