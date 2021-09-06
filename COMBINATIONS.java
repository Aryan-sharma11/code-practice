package com.company;

public class Main {

    static void permutaion(String str,int start,int end)
    {
        if(start==end)
        {
            System.out.println(str);
        }
        else
        {
            for(int i=start;i<end;i++)
            {

                str = swap(str,start,i);
                permutaion(str, start+1, end);
                str = swap(str,start,i);
            }
        }
    }
    static String swap()
    public static void main(String[] args) {
	// write your code here
        String str ="HISTORY";
        int n=str.length();
        permutaion(str,0,n-1);
    }
}
