package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        int x = verifica(num);
        if (x == 1) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
        scanner.close();
    }

    public static int verifica(double num) {
        if (num >= 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

