package com.ttn.java.excercise;

public class Reverse
{
            public static void main(String[] args)
            {
                StringBuffer line    = new StringBuffer("My New Workplace");
                System.out.println("String: " + line);
                System.out.println("Reverse: " + line.reverse());
                System.out.println(" Modified: " + line.delete(4,9));

            }
}