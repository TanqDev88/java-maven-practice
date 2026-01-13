package org.example.labDos;

import java.util.Objects;
import java.util.Scanner;

public class labDos {
    //Saber cual es el mayor de los numeros
    public static void main(String[] args) {

        double numUno= 2;
        double numDos = 3;

        String tipoOperacion = "R";
        double resultado;

        resultado = (numUno - numDos);
        System.out.println(resultado);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la operacion da realizar: ");
        tipoOperacion = scanner.next();

        double resultantDos;
        switch (tipoOperacion){
            case "S":
                 resultantDos = (numUno + numDos);
                System.out.println("El resultado es: " + resultantDos);
                break;
            case "R":
                resultantDos = (numUno - numDos);
                System.out.println("El resultado es:" + resultantDos);
                break;
                case "D":
                    resultantDos = (numUno / numDos);
                System.out.println("El resultado es:" + resultantDos);
                break;
            case "M":
                resultantDos = (numUno * numDos);
                System.out.println("El resultado es:" + resultantDos);
                break;
            default:
                System.out.println("No es ninguna operacion");
        }
    }
}