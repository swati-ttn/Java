package com.ttn.java.excercise;

enum house
{
   Bunglow(90),Appartment(20),Room(50),Farmhouse(15),Cottage(12);
   private final int price;

   house(int p)
   {
      price = p;
   }

   int getPrice()
   {
      return price;
   }  
}
public class demo
{
   public static void main(String args[])
   {
      //house h;
      System.out.println("Print House Rates:");
      for (house h : house.values()) {
         System.out.println(h + " Price " + h.getPrice() + " Cr.");
      }
   }
}