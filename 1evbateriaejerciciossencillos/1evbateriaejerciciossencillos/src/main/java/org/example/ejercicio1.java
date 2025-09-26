package org.example;

import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float horas;
        float tarifa;
        System.out.println("introduce el numero de horas trabajadas");
        horas = sc.nextFloat();
        System.out.println("introduce la tarifa horaria: ");
        tarifa = sc.nextFloat();

        float salario = horas * tarifa;

        System.out.println("el salario bruto del trabajador es: " +salario + "€");


    }
}

