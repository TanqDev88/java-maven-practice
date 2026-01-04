package org.example.labUho;

public class labDos {
    public static void main(String[] args) {
        float num1 = 89;
        float num2 = 89;
        float num3 = 89;
        float num4 = 89;

        float prom = (num1 + num2 + num3 + num4) / 4;

        System.out.println("El promedio de las notas es: " + (prom));

        int edad = 11;

        switch (edad) {
            case 18:
                System.out.println("Usuario tiene 18 años");
                break;
            default:
                System.out.println("Mensaje por defecto");
        }
        String mensaje = (edad >= 18) ? "El usuario es mayor de edad ternario" : "El usuario no es mayor de edad ternario";
        System.out.println(mensaje);
    }
}
