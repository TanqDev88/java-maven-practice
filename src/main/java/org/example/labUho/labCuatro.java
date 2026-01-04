package org.example.labUho;

public class labCuatro {
    public static void main(String[] args) {
        int[] numeros = {10, 8, 90, 45, 7, 0};

        int i = 0;
        /*while (true) {
            System.out.println("Buscamos el 45");
            if (numeros[i] == 45){
                System.out.println("45 Encontrado");
                break;
            }
            i ++;
        }*/

        i = 0;
        while (i < numeros.length) {
            if(numeros[i] != 45){
                System.out.println("Hizo el continue");
                i++;
                continue;
            }
            System.out.println("No hizo el continue");
        }
    }
}
