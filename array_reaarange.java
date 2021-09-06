package com.company;

import java.util.HashSet;

public class Main {

    static void rearrange(int [] arr)
    {

        HashSet<Integer> save=new HashSet<>();
        for(int item:arr)
        {
            save.add(item);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(save.contains(i))
            {
                arr[i]=i;

            }
            else
                arr[i]=-1;
        }
        for (int item:arr)
        {
            System.out.print(item+" ");
        }
    }
    public static void main(String[] args) {
	// write your code here
        int [] arr=new int []{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        //output =[-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
        rearrange(arr);//tc=O(n)
        System.out.println(" ");
        int []arr2=new int[]{19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        //output= [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        //         11, 12, 13, 14, 15, 16, 17, 18, 19]
        rearrange(arr2);
    }
}
