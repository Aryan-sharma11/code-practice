package com.company;

public class Main {

    public static int findpivot(int arr[],int low,int high)

    {
     if(low>high)
         return -1;
     if(low==high)
         return low;
     int mid=(low+high)/2;
     if(arr[mid]>arr[mid+1])
     {
         return mid;
     }
     if(arr[mid]<arr[mid-1])
         return mid-1;
     if(arr[low]>=arr[mid])
     {
        findpivot(arr,low,mid-1);
     }
     return findpivot(arr,mid+1,high);
    }
    public static int binarysearh(int []arr,int low,int high,int key)
    {
        int mid=(low+high)/2;
        while(low<high)
        {
            if(key>arr[mid])
            {
                low=mid+1;
                mid=(low+high)/2;
            }
            if(key>arr[mid])
            {
                high=mid-1;
                mid=(low+high)/2;
            }
            if(key==arr[mid])
                return mid;
        }
        return -1;
    }
    static int binarypivot(int [] arr,int key)
    {
        int pivot=findpivot(arr,0,arr.length-1);
        if (pivot==-1)
        {
            return binarysearh(arr,0,arr.length-1,key);
        }
        if (arr[pivot]==key)
            return pivot;
        if(arr[0]<=key)
            return binarysearh(arr,0,pivot-1,key);
        return binarysearh(arr,pivot+1,arr.length-1,key);
    }



    public static void main(String[] args) {
	// write your code here
        int [] arr=new int []{3,4,5,6,7,1,2};
      int x=  binarypivot(arr,7);
      System.out.print(x);

    }
}
