package org.example;

import java.util.Scanner;

public class ejercicioexamentipob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double primertrimestre;
        double segundotrimestre;
        double tercertrimestre;
        do {
            System.out.println("introduce tu nota primer trimestre");
            primertrimestre = sc.nextDouble();
            if (primertrimestre < 0 || primertrimestre > 10) {
                System.out.println("nota fuera de rando");
            }

        } while (primertrimestre < 0 || primertrimestre > 10);
        do {
            System.out.println("introduce tu nota segundo trimestre");
            segundotrimestre = sc.nextDouble();
            if (segundotrimestre<0 || segundotrimestre>10){
                System.out.println("nota fuera del rango");
            }
        }while(segundotrimestre<0 || segundotrimestre>10);
        do {
            System.out.println("introduce tu nota del tercer trimestre");
            tercertrimestre = sc.nextDouble();
            if (tercertrimestre<0 || tercertrimestre>10){
                System.out.println("tu nota esta fuera del rango");
            }
        }while (tercertrimestre<0 || tercertrimestre>10);

        double promedio = (primertrimestre + segundotrimestre + tercertrimestre)/3;
        System.out.println("la nota media es " +promedio);
    }
}
