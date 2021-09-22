package com.ttn.java.excercise;

public class Name
{
    static String firstName = "Swati";
    static String lastName = "Panwar";
    static int age = 30;

    public static void main(String[] args)
    {
        System.out.println("In main---" +firstName + " " + lastName + " " + age);
        print();
    }
    private static void print(){
        System.out.println("Static Method---");
        System.out.println("Swati , Panwar , 30");
    }
    static {
        System.out.println("Static Block---");
        System.out.println("Swati , Panwar , 30");
    }
}

