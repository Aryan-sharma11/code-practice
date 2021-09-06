package com.company;

import java.util.Stack;

public class Main {

    static Stack<Integer> st=new Stack<>();



    static void reverse_stack()
    {
        int x;
        if(!st.empty())
        {
            x=st.pop();
            reverse_stack();
            insert_in_st(x);
        }

    }
    static void insert_in_st(int x)
    {
        int c;

        if(!st.empty())
        {
            c=st.pop();
            insert_in_st(x);
            st.push(c);

        }
        else
            st.push(x);


    }

    public static void main(String[] args) {
	// write your code here
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        reverse_stack();
        System.out.println(st);
    }
}
