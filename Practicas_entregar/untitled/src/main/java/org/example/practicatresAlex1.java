package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class practicatresAlex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura = 0;
        double peso = 0;
        double pesominimo;
        double totalpeso;
        double pesomax;
        final double PESOMAXCONST = 120;
        final double ALTURAMAXCONST = 230;
        final double ALTURAMINCONST = 140;
        System.out.println("------------------------------");
        System.out.println("***Bienvenido al raton jugueton***");
        System.out.println("------------------------------");
        do {
            try {
                System.out.println("introduce tu altura");
                altura = sc.nextDouble();
            } catch (InputMismatchException err) {
                System.out.println("introduce un valor valido");
                return;
            }
            System.out.println("leyendo altura (cm) ......");
            if (altura > ALTURAMAXCONST || altura <= 0) {
                System.out.println("Error de lectura, baja de la bascula y vuelve a subir...");
            } else if (altura < ALTURAMINCONST) {
                double diferenciacm = ALTURAMINCONST - altura;
                System.out.println("para subir a la atraccion te faltan: " + diferenciacm + "cm");
            } else {
                System.out.println("altura correcta");
            }
        } while (altura > ALTURAMAXCONST || altura <= 0 || altura < ALTURAMINCONST);
        do {
            try {
                System.out.println("introduce tu peso");
                peso = sc.nextDouble();
            } catch (InputMismatchException err) {
                System.out.println("introduce un valor valido");
                return;
            }
            System.out.println("Leyendo peso....");
            pesominimo = (altura * 2 / 8);
            if (peso < 0) {
                System.out.println("introduce un valor positivo");
            } else if (peso < pesominimo) {
                totalpeso = pesominimo - peso;
                System.out.println("Lo siento, no superas el peso minimo, te faltan " + totalpeso + " kg para subir a la atraccion");
            } else if (peso > PESOMAXCONST) {
                pesomax = peso - PESOMAXCONST;
                System.out.println("Lo siento, sobrepasas en " + pesomax + " kg el limite de la atraccion");

            } else {
                System.out.println("pesas " + peso + " kg, peso minimo calculado: " + pesominimo);
                System.out.println("¡¡Sube a la atraccion!!");
            }
        } while (peso < 0);
    }
}

