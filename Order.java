/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_commercesystem;

/**
 *
 * @author Menna Taha
 */
public class Order  {
    
      protected int customerId;
      protected int orderId;
      protected Product[]Products;
      protected float  totalprice;

    public Order() {
    }

    public Order(int customerId, int orderId,int nproducts,Product []Products) {
        this.customerId =Math.abs( customerId);
        this.orderId = Math.abs(orderId);
      this.Products=Products;
      
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product[] getProducts() {
        return Products;
    }

    public void setProducts(Product[] Products) {
        this.Products = Products;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }
    
      public void printOrderInfo(){
          System.out.println("Here is your order 's sammary:");
          System.out.println("Order ID :"+orderId);
           System.out.println("Customer ID:"+customerId);
            System.out.println("Products: ");
           for(int i=0;i<Products.length;i++){
               System.out.println(Products[i].name+" - $"+Products[i].price);}
               System.out.println("Total price : $"+getTotalprice());}}
                
           
           
      
      

    


