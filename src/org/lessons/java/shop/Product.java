package org.lessons.java.shop;

import java.util.Random;

public class Product {

    // CAMPI

    private int code;

    private String name;

    private String description;

    private double price;

    private double iva;

    // COSTRUTTORI

    public Product(int code){
        this.code= new Random().nextInt(1,100000000);
    }

    public Product(String name, String description, double price, double iva){

        this.name=name;
        this.description= description;
        this.price= price;
        this.iva=iva;
    }

    // GETTER AND SETTER

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }



    // METODI


    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
