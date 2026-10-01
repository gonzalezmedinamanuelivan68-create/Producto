package com.mycompany.producto;

/**
 *
 * @author Gonzalez Medina Manuel Ivan
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
    private String codigoDeBarras;
    
    public Product(){
        this("", 0.0, 0,"");
    }
    public Product(String name, double price, int quantity, String codigoDeBarras){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.codigoDeBarras=codigoDeBarras;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public String getCodigoDeBarras(){
        return codigoDeBarras;
    }
    public void setCodigoDeBarras(String codigoDeBarras){
        this.codigoDeBarras=codigoDeBarras;
    }
   
    
}
