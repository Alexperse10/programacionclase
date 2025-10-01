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
        double pesomaxconst = 120;
        double alturamaxconst = 230;
        double alturaminconst = 140;
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
            if (altura > alturamaxconst || altura <= 0) {
                System.out.println("Error de lectura, baja de la bascula y vuelve a subir...");
            } else if (altura < alturaminconst) {
                double diferenciacm = alturaminconst - altura;
                System.out.println("para subir a la atraccion te faltan: " + diferenciacm + "cm");
            } else {
                System.out.println("altura correcta");
            }
        } while (altura > alturamaxconst || altura <= 0 || altura < alturaminconst);
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
            } else if (peso > pesomaxconst) {
                pesomax = peso - pesomaxconst;
                System.out.println("Lo siento, sobrepasas en " + pesomax + " kg el limite de la atraccion");

            } else {
                System.out.println("pesas " + peso + " kg, peso minimo calculado: " + pesominimo);
                System.out.println("¡¡Sube a la atraccion!!");
            }
        } while (peso < 0);
    }
}

