package org.example;

import java.util.Scanner;

public class Practicatresalex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura;
        double peso;
        double pesominimo;
        double totalpeso;
        double pesomax;
        System.out.println("------------------------------");
        System.out.println("***Bienvenido al raton jugueton***");
        System.out.println("------------------------------");
        System.out.println("introduce tu altura");
        altura = sc.nextDouble();
        System.out.println("leyendo altura (cm) ......");
        if (altura>230 || altura<=0){
            System.out.println("Error de lectura, baja de la bascula y vuelve a subir...");
        } else if (altura<140) {
            double diferenciacm = 140 - altura;
            System.out.println("para subir a la atraccion te faltan: " +diferenciacm +"cm");
        } else {
            System.out.println("altura correcta");
        }
        System.out.println("introduce tu peso");
         peso = sc.nextDouble();
         System.out.println("Leyendo altura....");
        pesominimo = (altura*2/8);
        if (peso<pesominimo) {
            totalpeso = peso - pesominimo;
            System.out.println("Lo siento, no superas el peso minimo requerido para subir a la atraccion");
        } else if (peso>120) {
            pesomax = peso - 120;
            System.out.println("Lo sineto, sobrepasas en "+pesomax+ " kg el limite de la atraccion");

        }else {
            System.out.println("pesas " +peso+ " kg, peso minimo calculado: " +pesominimo);
            System.out.println("¡¡Sube a la atraccion!!");
        }

    }
}
