package org.example.labDos;

import java.util.Random;
import java.util.Scanner;

public class ejTres {
    public static void main(String[] args) {
        int num = new Random().nextInt(9);

        Scanner teclado = new Scanner(System.in);

        boolean adininado = false;

        while (!adininado){
            System.out.println("Ingresa un numero del 1 al 10");
            int numUsuario = teclado.nextInt();
            if (num == numUsuario){
                adininado = true;
                System.out.println("Ese es el numero");
            }
        }

    }
}
