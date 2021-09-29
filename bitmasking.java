package com.company;

public class bitmasking {
   static boolean checkubnique(String str) //function to check if the characters in the string all are unique using bitmasking approach
                                    // assumption is taken that the string contains only a-z characters
    {
        int checker=0;
        for(int i=0;i<str.length();i++)
        {
            int value=str.charAt(i)-'a';
            if((checker&(1<<value))>0)
                return false;
            checker=checker|(1<<value);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println( checkubnique("abcdmnnp"));
    }
}
