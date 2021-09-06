package com.company;

public class Main {
    static int partition(int []arr,int low,int high)
    {
        int pivot =0;
        int i=low;
        for(int j=low;j<high;j++)
        {
            if(pivot>arr[j])
            {
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }



        return i;

    }
    static void rearrange(int arr[])
    {
        int pivot=partition(arr,0,arr.length-1);
        int i=0,j=pivot;
   while(i<j&&arr[i] < 0&&j< arr.length)
        {
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=2;
            j++;
        }
        for(int item:arr)
            System.out.print(item);
        
    }
    public static void main(String[] args) {
	// write your code here
        int arr[]=new int []{-1, 2, -3, 4, 5, 6, -7, 8, 9};
        rearrange(arr);
    }
}
