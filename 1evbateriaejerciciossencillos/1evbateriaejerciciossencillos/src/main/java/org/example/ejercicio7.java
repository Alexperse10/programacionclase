package org.example;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tenemos tomate");
        String tomate = sc.nextLine();
        System.out.print("tenemos aceite");
        String aceite = sc.nextLine();
        System.out.println("tenemos jamon");
        String jamon = sc.nextLine();

        if (tomate.equalsIgnoreCase("no") || aceite.equalsIgnoreCase("no") || jamon.equalsIgnoreCase("no")){
            System.out.println("tenemos que ir a comprar");
        }else {
            System.out.println("no tenemos que ir a comprar");
        }
    }
}
