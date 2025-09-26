package org.example;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int mayor=0;
        int menor=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introducir un numero");
        int numero1 = sc.nextInt();
        System.out.println("introducir segundo numero");
        int numero2 = sc.nextInt();
        System.out.println("introducir un tercer numero");
        int numero3 = sc.nextInt();

        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3){
            System.out.println("error ha introducido numeros iguales");

        }else {
            if (numero1 > numero2 && numero1 > numero3){
                mayor = numero1;
            } else if (numero2 >numero1 && numero2 >numero3) {
                mayor = numero2;
            } else{
                mayor = numero3;
            }

        if (numero1<numero2 && numero1 <numero3) {
                menor = numero1;
            } else if (numero2<numero1 && numero2<numero3) {
                menor = numero2;
            } else {
            menor = numero3;
        }
        }

        System.out.println("el numero mayor es " +mayor);
        System.out.println("el numero menor es " +menor);
    }
}
