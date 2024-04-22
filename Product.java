/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_commercesystem;

/**
 *
 * @author Menna Taha
 */
public class Product {
    protected int productId;
    protected String name;
    protected float price;

    public Product() {
    }

    public Product(int productId, String name, float price) {
        this.productId =Math.abs( productId);
        this.name = name;
        this.price =Math.abs(price);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
