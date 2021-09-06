package com.company;

import java.util.Stack;

public class Main {

    static Stack<Integer> st1=new Stack<>();
    static Stack<Integer> st2=new Stack<>();

    static void q_Using_StackInsert(int a)
    {
        st1.add(a);
    }
    static void st1_2_st2()
    {
        while(!st1.empty())
        st2.add(st1.pop());
    }
    static void pop_queue()
    {
        System.out.println(st2.pop());
    }
    public static void main(String[] args) {
	// write your code here
        q_Using_StackInsert(1);
        q_Using_StackInsert(2);
        q_Using_StackInsert(3);
        q_Using_StackInsert(4);
        q_Using_StackInsert(5);
        q_Using_StackInsert(6);
        st1_2_st2();
        pop_queue();
        pop_queue();
        pop_queue();
        pop_queue();


    }
}
