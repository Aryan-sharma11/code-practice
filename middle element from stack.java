package com.company;

import java.util.Stack;

public class Main {
    static Stack<Integer> st1= new Stack<>();
    static Stack<Integer> midstack=new Stack<>();
    static void push(int data)
    {
        st1.push(data);

    }
    static void push()
    {
       System.out.println( st1.pop());
    }
    static void delete_middle()
    {
        int n;
        n=st1.size()%2==0?st1.size()/2:st1.size()/2+1;
        while(!st1.empty())
        {
            n--;
            if(n==0)
            {
                System.out.println(st1.pop());
            }
            midstack.push(st1.pop());
        }
        while (!midstack.empty())
        {
            st1.push(midstack.pop());
        }
    }
    static void find_middle()
    {
        int n;
        n=st1.size()%2==0?st1.size()/2:st1.size()/2+1;


        while(!st1.empty())
        {

            n--;
            if(n==0)
            {
                System.out.println(st1.peek());
            }
            midstack.push(st1.pop());

        }
        while (!midstack.empty())
        {
            st1.push(midstack.pop());
        }
    }

    public static void main(String[] args) {
	// write your code here
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        st1.push(6);
        st1.push(7);
        find_middle();
        delete_middle();
        find_middle();
        delete_middle();
        find_middle();




    }
}
