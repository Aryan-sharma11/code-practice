package com.company;

import java.util.Stack;

public class Main {
    static Stack<Integer> st1=new Stack<>();

    static void recursion()
    {
        if(!st1.empty())
        {
            int x;
            x= st1.pop();
            recursion();
            st1sort(x);
        }

    }
    static void st1sort(int x)
    {
        if(!st1.isEmpty()&&x<st1.peek())
        {
            int c;
            c=st1.pop();
            st1sort(x);
            st1.push(c);

        }
        else
            st1.push(x);
    }
    public static void main(String[] args) {
	// write your code here
        st1.push(30);
        st1.push(-5);
        st1.push(18);
        st1.push(14);
        st1.push(-3);
        System.out.println(st1);
        recursion();
        System.out.println(st1);



    }
}
