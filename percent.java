package com.ttn.java.excercise;

public class percent
{
        public static void main(String args[])
        {
           String datainput = "And miles to go before I sleep, and miles to go before I sleep and 2 2 2 .";
           char [] charArray = datainput.toCharArray();
           int uppercase = 0,lowercase= 0, digits = 0, others = 0;
     
           int Charsnumber = datainput.length();
           for(int i=0; i<datainput.length(); i++)
           {
              if (Character.isUpperCase(charArray[i])) {
                 uppercase++;
              }
              else if(Character.isLowerCase(charArray[i])) {
                 lowercase++;
              }
              else if(Character.isDigit(charArray[i])) {
                 digits++;
              }
              else {
                 others++;
              }
           }
           System.out.println("String Input :"+datainput);
           System.out.println("String total Length :"+Charsnumber);
           System.out.println("********************************");
           System.out.println("Upper case count:"+uppercase);
           System.out.println("Upper case letters Percentage: "+(uppercase*100)/Charsnumber);
           System.out.println("********************************");
           System.out.println("Lower case :"+lowercase);
           System.out.println("Lower case letters Percentage:"+(lowercase*100)/Charsnumber);
           System.out.println("********************************");
           System.out.println("Digit :"+digits);
           System.out.println("Percentage of digits :"+(digits*100)/Charsnumber);
           System.out.println("********************************");
           System.out.println("Others :"+others);
           System.out.println("Percentage of other characters :"+(others*100)/Charsnumber);
        }
}