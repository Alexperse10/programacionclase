package org.example;

import java.util.Scanner;

public class ejercicio2parte2examentema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anchoazulejos;
        int altoazulejos;
        int altopared;
        int anchopared;
        System.out.println("introduce el valor de ancho los azulejos");
        anchoazulejos = sc.nextInt();
        System.out.println("introduce el valor de alto de los azulejos");
        altoazulejos = sc.nextInt();
        System.out.println("introduce el valor de ancho de pared");
        anchopared = sc.nextInt();
        System.out.println("introduce el valor de alto de pared");
        altopared = sc.nextInt();

        double areaazulejos = anchoazulejos * altoazulejos;
        double areapared = altopared * anchopared;

        if (anchoazulejos == altoazulejos){
            System.out.println("el azulejo no puede ser cuadrado");
        } else if (areaazulejos>=areapared) {
            System.out.println("no puede ser el azulejo mas grande que la pared");
        }else {
            double numeroazulejos = areapared/areaazulejos;
            System.out.println("la pared necesita "+numeroazulejos + "azulejos");
        }

    }
}
