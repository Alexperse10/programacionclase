package org.example;

import java.util.Scanner;

public class valor_absoluto_mayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = 0;
        int contador = 0;
        boolean repetir = false;
        int valorabsoluto;
        int mayor = 0;

        while (contador < 5) {
            do {
                try {
                    System.out.println("Introduce un número (" + (contador + 1) + " de 5): ");
                    numero1 = sc.nextInt();
                    repetir = false;
                } catch (Exception err) {
                    System.out.println("Introduce un valor válido.");
                    repetir = true;
                    sc.nextLine(); // limpia el buffer solo cuando hay error
                }
            } while (repetir == true);

            // Calcular el valor absoluto
            if (numero1 < 0) {
                valorabsoluto = numero1 * -1;
            } else {
                valorabsoluto = numero1;
            }

            // Mostrar el valor absoluto
            System.out.println("El valor absoluto es: " + valorabsoluto);

            // Comprobar si es el mayor valor absoluto
            if (contador == 0 || valorabsoluto > mayor) {
                mayor = valorabsoluto;
            }

            // Aumentar el contador
            contador = contador + 1;
        }

        // Mostrar el resultado final
        System.out.println("El mayor valor absoluto introducido es: " + mayor);
    }
}