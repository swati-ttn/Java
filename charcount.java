package com.ttn.java.excercise;

public class charcount
{  
    public static void main(String[] args)
    {  
        String inputstring = "And miles to go before I sleep, and miles to go before I sleep.";  
        int stringLength = inputstring.length();
        System.out.println("Total String length: " + stringLength);

        int stringLengthWithoutSpaces = inputstring.replace(" ", "").length();
        System.out.println("String length count without spaces : " + stringLengthWithoutSpaces);
    }
}
    