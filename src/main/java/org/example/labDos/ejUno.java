package org.example.labDos;

public class ejUno {
    public static void main(String[] args) {

        int a = 10;
        int b = 25;
        int c = 18;

        if (a > b && a > c) {
            System.out.println("A is the largest: " + a);
        } else if (b > a && b > c) {
            System.out.println("B is the largest: " + b);
        } else {
            System.out.println("C is the largest: " + c);
        }
    }
}