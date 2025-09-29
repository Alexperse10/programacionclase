package org.example;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un lado a");
        double ladoa = sc.nextDouble();
        System.out.println("introduce un lado b");
        double ladob = sc.nextDouble();
        System.out.println("introduce un lado c");
        double ladoc = sc.nextDouble();

        if (ladoa == ladob && ladob == ladoc){
            System.out.println("el triangulo es equilatero");
        } else if (ladoa == ladoc || ladoa == ladob) {
            System.out.println("el triangulo es isosceles");

        } else {
            System.out.println("el triangulo es escaleno");

        }
    }

}
