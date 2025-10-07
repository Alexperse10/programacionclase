package org.example;

import java.util.Scanner;

public class examenmodelobexer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double promedio;
        do {
            System.out.println("introduce la nota del primer trimestre");
            nota1 = sc.nextDouble();
            System.out.println("introduce la nota del segundo trimestre");
            nota2 = sc.nextDouble();
            System.out.println("introduce la nota del tercer trimestre");
            nota3 = sc.nextDouble();
            if (nota1<0 || nota2<0 || nota3<0 ||nota1>10 || nota2>10 || nota3>10){
                System.out.println("introduzca un valor valido");
            }
        }while(nota1<0 || nota2<0 || nota3<0 ||nota1>10 || nota2>10 || nota3>10);
        promedio = (nota1 +nota2 +nota3)/3;
        System.out.println("la nota media del curso es "+promedio);
    }
}
