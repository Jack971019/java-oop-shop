package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci il nome del prodotto");
        String name = scan.nextLine();

        System.out.println("inserisci la descrizione del prodotto");
        String description = scan.nextLine();

        System.out.println("inserisci il prezzo del prodotto");
        double price = Integer.parseInt(scan.nextLine());

        System.out.println("inserisci il valore dell'iva sul prodotto");
        double iva = Integer.parseInt(scan.nextLine());



    }
}
