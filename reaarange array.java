package com.company;

import java.util.Arrays;

public class Main {
    static void rearrange(int [] arr,int end,int front)
    {
        int [] arr1=new int [arr.length];
        int k=0;
        for(int i=end-1;i>=0;i=i-2)
        {
            arr1[i]=arr[k++];
        }
        for(int i=front;i<arr.length;i+=2) {
            arr1[i] = arr[k++];
        }
        for(int item:arr1)
            System.out.println(item);
    }
    public static void main(String[] args) {
	// write your code here
        int [] arr1=new int[]{1,2,4,5,1,6,8,8};
        Arrays.sort(arr1);
        if(arr1.length%2!=0)
            rearrange(arr1, arr1.length,1);//T.C O(n) S.C O(n)
        else
            rearrange(arr1,arr1.length-1,1);


    }

}
