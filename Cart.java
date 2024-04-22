/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 */
package com.mycompany.e_commercesystem;
import java.util.Scanner;
public class Cart {
     protected int customerId;
      protected int nProducts;
       protected Product[] Products;
       int x;
       public Cart() {
    }
       public Cart(int customerId, int nProducts) {
        this.customerId =Math.abs( customerId);
        this.nProducts =Math.abs(nProducts) ;
      this.Products=new Product[nProducts]; 
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }

    public Product[] getProducts() {
        return Products;
    }
    public void addproduct(Product p){
        for(int i=0;i<nProducts;i++){
        if (Products[i]==null){
            Products[i]=p;
            break;                   
        }}
    }
    public void removeproduct(Product p){
        for(int i=0;i<nProducts;i++){
            if(Products[i]==p){
                Products[i]=null;
            }
        }
        }
    public float calculateprice(){
        float totalprice=0.0f;
        for(int i=0;i<nProducts;i++){
            if( Products[i]!=null){
            totalprice+=Products[i].price;
            }
        }
        return totalprice;
    }
    public void placeorder(){
        Scanner input=new Scanner(System.in);
        System.out.println("Would you like to place the order?1-Yes 2-No");
       x =input.nextInt();   
     
       
    }        
}

    


    

