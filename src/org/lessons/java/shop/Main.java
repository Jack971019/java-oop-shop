package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci il nome del prodotto:");
        String name = scan.nextLine();

        System.out.println("inserisci la descrizione del prodotto:");
        String description = scan.nextLine();

        System.out.println("inserisci il prezzo del prodotto:");
        double price = Integer.parseInt(scan.nextLine());

        System.out.println("inserisci il valore dell'iva sul prodotto:");
        double iva = Integer.parseInt(scan.nextLine());

        // Stampo il prodotto

        Product product = new Product(name, description,price, iva);

        System.out.println("Codice prodotto:"+ product.getCode());
        System.out.println("Nome prodotto:"+ product.getName());
        System.out.println("Nome prodotto:"+ product.getDescription());
        System.out.println("Nome prodotto:"+ product.getPrice());
        System.out.println("Nome prodotto:"+ product.getPricePlusIva());




        scan.close();
    }
}
