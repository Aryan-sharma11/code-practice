package com.company;

public class permutation {
    static void perm(String s,String a)
    {
        if(s.length()==0)
        {
            System.out.println(a);
        }
        else{
            for(int i=0;i<s.length();i++)
            {
                String rem=s.substring(0,i)+s.substring(i+1);
                perm(rem,a+s.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        perm("abc","");
    }
}
