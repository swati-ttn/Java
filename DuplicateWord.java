package com.ttn.java.excercise;

public class DuplicateWord {  
    public static void main(String[] args)
    {  
        String string = "And miles to go before I sleep, and miles to go before I sleep.";  
        int count;  
        String words[] = string.split(" ");  
          
        System.out.println("Duplicate words in String : ");   
        for(int i = 0; i < words.length; i++) 
        {  
                count = 1;  
                for(int j = i+1; j < words.length; j++)
                {  
                    if(words[i].equals(words[j])) {  
                    count++;  
                }  
            } 
            if(count > 1 && words[i] != "0")  
                System.out.println(words[i]);  
        }  
    }  
}  