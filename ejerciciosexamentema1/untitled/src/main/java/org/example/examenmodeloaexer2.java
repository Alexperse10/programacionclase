package org.example;

import java.util.Scanner;

public class examenmodeloaexer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double anchopared;
        double altopared;
        double anchoazulejo;
        double altoazulejo;

        System.out.println("introduce el ancho de la pared");
        anchopared = sc.nextDouble();
        System.out.println("introduce el alto de la pared");
        altopared = sc.nextDouble();
        System.out.println("introduce el ancho del azulejo");
        anchoazulejo = sc.nextDouble();
        System.out.println("introduce el alto del azulejo");
        altoazulejo = sc.nextDouble();
        double areaazulejo = anchoazulejo * altoazulejo;
        double areapared = anchopared * altoazulejo;
        double azulejosrequeridos = areapared/areaazulejo;
        if (altoazulejo == anchoazulejo){
            System.out.println("el azulejo es cuadrado debe ser rectangular");
        } else if (areaazulejo>=areapared) {
            System.out.println("el azulejo no puede ser mayor que la pared");
        } else {
            System.out.println("el numero de azulejos que necesitamos es" +azulejosrequeridos);

        }

    }
}
