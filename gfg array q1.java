package com.company;


public class Main {
 public static void firstapp(int arr1[])
{
    int d=3;

    int arr2[] =new int [d];
    for(int i=0;i<d;i++)
    {
        arr2[i]=arr1[i];

    }
    for(int i:arr1)
        System.out.print(i);
    for(int i=0;i< arr1.length-d;i++)
    {
        arr1[i]=arr1[i+d];

    }
    System.out.println("");
   int k=0;
    for(int i=arr1.length-d;i<arr1.length;i++)
    {
        arr1[i]=arr2[k++];
    }
    for(int i:arr1)
        System.out.print(i);

}
public static void secondapp(int arr1[])
{
    int d=2;
    System.out.println(" ");
    for(int i:arr1)
    {
        System.out.print(i);
    }
    while(d>0)
    {
        int temp;
        temp=arr1[0];
        for(int i=1;i<arr1.length;i++)
        {
            arr1[i-1]=arr1[i];
        }
        arr1[arr1.length-1]=temp;
        d--;
    }
    System.out.println(" ");
    for(int i:arr1)
    {
        System.out.print(i);
    }

}
public static void reverse(int arr[],int start,int end)
{
    for (int i=start;i<=end;i++)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        end--;

    }
}
public static void reverselalgo(int arr[])
{
    int d=2;
    System.out.println("");
    reverse(arr,0,d-1);
    reverse(arr,d,arr.length-1);
    reverse(arr,0,arr.length-1);
    for(int i:arr)
    {
        System.out.print(i);
    }

}
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3,4,5,6,7};
        firstapp(arr1);
        int[] arr2=new int[]{1,2,3,4,5,6,7};
        secondapp(arr2);
        int[] arr3=new int[]{1,2,3,4,5,6,7};
        reverselalgo(arr3);


	// write your code here
    }
}
