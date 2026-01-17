package org.example.labDos;

import java.util.Scanner;

public class ejCuatro {
    public static void main(String[] args) {
        String usuario = "jor";
        String pass = "123456";

        Scanner scanner = new Scanner(System.in);
        int intentos = 3;
        int cantidadIntentos = 0;

        while (intentos > cantidadIntentos) {
            System.out.println("Ingrese usuario: ");
            String usuarioIngresada = scanner.next();

            System.out.println("Ingrese contraseña: ");
            String contraseñaIngresada = scanner.next();

            if (usuarioIngresada.equals(usuario) &&
                    contraseñaIngresada.equals(pass)) {

                System.out.println("Ingreso exitoso!");
                break;

            } else {
                cantidadIntentos++;
                System.out.println("Datos incorrectos");

                if (cantidadIntentos == intentos) {
                    System.out.println("Bloqueado!");
                    break;
                }
            }
        }
    }
}
