package com.company;

import java.util.HashSet;

public class Main {
    static int partition(int []arr1,int low,int high)
    {

        int pivot=arr1[high];
        int i=low;
        for(int j=low;j<high;j++)
        {
            if(pivot>arr1[j])
            {
                int temp;
                temp=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=temp;
                i++;

            }
        }
        int temp=arr1[i];
        arr1[i]=pivot;
        arr1[high]=temp;
        return i;
    }
    static void quicksort(int[] arr1,int low,int high)
    {
        if(low<high) {
            int pivot = partition(arr1, low, high);
            quicksort(arr1, low, pivot - 1);
            quicksort(arr1, pivot + 1, high);
        }

    }
    static boolean binsarysearch(int [] arr1,int [] arr2)
    {
        quicksort(arr1,0,arr1.length-1);
        for(int item:arr2)
        {
            int low=0;
            int flag=0;
            int high= arr1.length-1;
            int mid=(low+high)/2;
            while(low<high)
            {
                if(arr1[mid]==item)
                {
                    flag=1;
                    break;
                }
                if(arr1[mid]>item)
                    high=mid-1;
                if(arr1[mid]<item)
                    low=mid+1;
               mid=(low+high)/2;
            }
            if(flag==0)
                return false;
        }
        return true;
    }
    static boolean check(int [] arr1,int [] arr2)
    {
        HashSet<Integer> m=new HashSet<>();
        for(int item:arr1)
        {
            m.add(item);
        }
        for(int item:arr2)
        {
            if(!m.contains(item))
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
	// write your code here
        int[] arr1=new int[]{11, 1, 13, 21, 3, 7};
        int[] arr2=new int[]{11,3,7,1};
        System.out.println(check(arr1,arr2));
        System.out.println(binsarysearch(arr1,arr2));



    }
}
