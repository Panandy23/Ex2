package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double r;
        double v;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość promienia: ");

        r = scanner.nextDouble();

        v = 4/3 * Math.PI * Math.sqrt(r)*r;

        System.out.println("Pole kuli wynosi: ");
        System.out.printf("%.2f%n", v);
    }
}
