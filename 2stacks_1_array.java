package com.company;

public class Main {

    static int arr[] = new int [20];
    static int top1=-1,top2=arr.length;
    static void push1(int data)
    {
        if(top1<top2) {
            arr[++top1] = data;

        }
        else
            System.out.println("stack over flow");
    }
    static void push2(int data)
    {
        if(top2>top1) {
            arr[--top2] = data;

        }
        else
            System.out.println("Stack over flow");
    }
    static void pop1()
    {
        if(top1>=0) {
            System.out.println(arr[top1]);
            top1--;
        }
        else
            System.out.println("stack under flow");
    }
    static void pop2()
    {
        if(top2<arr.length) {
            System.out.println(arr[top2]);
            top2++;
        }
        else
            System.out.println("stack under flow");
    }
    public static void main(String[] args) {
	// write your code here
        push1(1);
        push1(2);
        push1(3);
        push2(6);
        push2(5);
        push2(4);
        pop1();
        pop2();
        push1(7);
        push2(8);
        pop2();
        pop1();

    }
}
