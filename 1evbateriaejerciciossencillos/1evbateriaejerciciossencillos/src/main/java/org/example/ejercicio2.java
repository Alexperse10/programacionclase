package org.example;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horas;
        double tarifa;
        System.out.println("introduce el numero de horas trabajadas");
        horas = sc.nextFloat();
        System.out.println("introduce importe de la tarifa");
        tarifa = sc.nextFloat();

        double salario = horas * tarifa;



        if (horas>40){
            double calcularhoras = horas-40;
            double tarifasuplemento = calcularhoras * (1.5 *tarifa);
            double totalsalario = tarifasuplemento + salario;
            System.out.println("el sueldo con suplemento es " +totalsalario);

        }else {
            System.out.println("el salario en bruto del empleado es " +salario);
        }
    }
}
