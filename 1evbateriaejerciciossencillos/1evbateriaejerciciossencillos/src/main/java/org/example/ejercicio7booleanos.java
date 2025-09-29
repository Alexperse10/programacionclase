package org.example;

import java.util.Scanner;

public class ejercicio7booleanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tenemos tomates");
        boolean tomate = sc.nextBoolean();
        System.out.println("tenemos aceite");
        boolean aceite = sc.nextBoolean();
        System.out.println("tenemos jamon");
        boolean jamon = sc.nextBoolean();

        if (!tomate || !aceite || !jamon) {
            System.out.println("tenemos que ir a comprar");
        } else {
            System.out.println("no tenemos que ir a comprar");
        }
    }
}
