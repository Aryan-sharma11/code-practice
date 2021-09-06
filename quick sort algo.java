package com.company;

public class Main {

    static int  partition(int arr[],int low,int high)
    {
        int pivot=high;
        int i=low;
        for (int j=0;j<=high;j++)
        {
            if(arr[pivot]>arr[j])
            {
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;

            }

        }
        int temp=arr[i];
        arr[i]=arr[pivot];
        arr[pivot]=temp;
        return i;

    }
    static void quicksort(int arr[],int low,int high)
    {

        if(low<high)
        {
            int pi=partition(arr,0,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static void main(String[] args) {
	// write your code here
        int arr[]=new int[]{ 10, 7, 8, 9, 1,9, 5};
        quicksort(arr,0,arr.length-1);
        for (int item:arr)
        {
            System.out.println(item);
        }
    }
}
