/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;
import java.util.Scanner;
/**
 *
 * @author Menna Taha
 */
public class EcommerceSystem {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
       ElectronicProduct smartphone=new ElectronicProduct("samsung",1,1,"smartphone",599.9f);
       ClothingProduct  T_shirt=new ClothingProduct("Medium","Cotton",2,"T_shirt",19.99f);
      BookProduct OOp=new BookProduct("O`Reilly","X publicatins",3,"OOp",39.99f); 
        System.out.println("Welcome to E-commerce system");
        System.out.println("Enter your  id");
        int customerId=input.nextInt();
        System.out.println("Enter  your name");
      String name=input.next();
      System.out.println("Enter your address");
      String address=input.next();
     
       Customer customer =new Customer(customerId,name,address);
        System.out.println("How many products do you want to add to your cart ");
       int  nproducts=input.nextInt();
       
      Cart c=new Cart (customerId,nproducts);
      Product p=null;
     for( int i=0;i<nproducts;i++){
        System.out.println("Which product would you like to add? 1-Smartphone 2-T-shirt 3-OOp");
        int productType=input.nextInt();
          
      switch(productType){
               case 1:
            p=smartphone;
            
             break;
               case 2:
            p=T_shirt;
          
            break;
               case 3:
                   p=OOp;
                   
             break;
               default:
                   System.out.println("Invalid product Type");}
     if(p!=null)
         c.addproducts(p);}
            
          System.out.println("Your total is"+c.calculateprice());
            
            
             Order o=new Order();
             
            c.placeorder();
            if(c.x==1){
           o.printOrderInfo();
            }
            
            for(int i=0;i<c.Products.length;i++){
           c. Products[i]=null;
             
      }}}