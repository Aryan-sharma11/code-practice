package com.company;

public class Main {
    public static void method1(int arr [],int d,int n)
    {
        int [] store=new int [d];
        int k=0;
        for(int i=arr.length-d;i <arr.length;i++) {
            store[k++] = arr[i];
        }
        for(int i=n-d-1;i>=0;i--) {
            arr[i + d] = arr[i];
        }
        for(int i=0;i<d;i++) {
            arr[i] = store[i];
        }
        for(int item:arr)
{
    System.out.println(item);
}
    }
    public static void main(String[] args) {
	// write your code here
        int arr[];
        arr= new int[]{1, 2, 3, 4, 5, 6, 7};
        method1(arr,2,arr.length);
    }
}
