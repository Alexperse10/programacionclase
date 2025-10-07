package org.example;

import java.util.Scanner;

public class bateriaejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salariobruto;
        System.out.println("introduce el numero de horas");
        int horas = sc.nextInt();
        System.out.println("introduce la tarifa");
        double tarifa = sc.nextDouble();

        salariobruto = horas * tarifa;
        System.out.println("el sario bruto es " +salariobruto);
    }
}
