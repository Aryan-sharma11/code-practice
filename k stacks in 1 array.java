package com.company;

public class Main {

    static int [] arr=new int[30];
    static int top[];
    static int next[]=new int[30];
    static int free=0;
    static void divide_k_stacks(int k)
    {
        int n;
        n=arr.length/k;
        top=new int[n];
        for(int i=0;i<top.length;i++)
        {
            top[i]=-1;
        }
        for(int i=0;i<next.length-1;i++)
        {
            next[i]=i+1;
        }
        next[next.length-1]=-1;
    }
    static void push(int data,int kth)
    {
        if(top[kth-1]==-1);
        {
            arr[free]=data;
            top[kth]
        }

    }
    public static void main(String[] args) {
	// write your code here
        int k;
        k=4;

    }
}
