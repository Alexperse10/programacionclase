package org.example;

import java.util.Scanner;

public class examenmodelobexer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        boolean repetir = false;
        int valorabsoluto;
        do {
            try{
                System.out.println("introduce un numero");
                numero = sc.nextInt();
                repetir= false;
            }catch (Exception err){
                System.out.println("ERROR: introduce un valor valido");
                repetir = true;
            }
            sc.nextLine();
        }while (repetir==true);
        if (numero<0){
            valorabsoluto = numero*(-1);
            System.out.println("el valor absoluto del numero es " +valorabsoluto);
        }else {
            System.out.println("el valor absoluto del numero es " +numero);
        }
    }
}
