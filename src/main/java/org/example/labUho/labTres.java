package org.example.labUho;

public class labTres {
    public static void main(String[] args) {
        for (int ln = 0; ln < 10; ln++) {

            System.out.println(ln);
        }

        int j = 0;
        boolean isFinished = false;
        while (!isFinished) {
            System.out.println("El valor de j es : " + j);
            if (5 > j) {
                isFinished = true;
            }
            j++;
        }
        int [] numeros = {10, 8, 90};
        int [] numeros2 = new int [1];

        for (int i = 0; i < numeros.length; i ++){
            System.out.println(numeros[i]);
        }
    }
}
