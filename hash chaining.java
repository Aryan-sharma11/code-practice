package com.company;

import org.w3c.dom.Node;

public class Main {
//    class Node{
//        int data;
//        Node next;
//    }
    public static int [] arr=new int[7];
    static void insert(int v){
     for(int i=0;i<7;i++)
     {
         if(arr[(v+i*i)%7]==0)
         {
             arr[(v+i*i)%7]=v;
             break;
         }
     }

    }
    static int search(int key)
    {
        int i=1;
            if(arr[key%7]==key)
            {
                return 1;
            }
            while(arr[(key+i*i)%7]<7)
            {
                if(arr[(key+i*i)%7]==key)
                {
                    return 1;
                }
                i++;
            }
        return 0;
    }
    public static void main(String[] args) {
	// write your code here
     insert(2);
     insert(3);
     insert(4);
     insert(16);
     insert(9);
     for(int item :arr)
         System.out.print(item);

     System.out.println(search(10));



    }
}
