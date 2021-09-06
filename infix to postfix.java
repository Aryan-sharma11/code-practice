package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Main {
    static HashMap<Character,Integer> priority=new HashMap<>();
    static Stack<Character> st=new Stack<>();

    static void setPriority()
    {
        priority.put('*',2);
        priority.put('/',2);
        priority.put('+',1);
        priority.put('-',1);
        priority.put('^',3);
    }

    static void stackset(String s)
    {
        char [] ch;
        ch=s.toCharArray();
        for(char c :ch)
        {
            if (Character.isLetterOrDigit(c))
                System.out.print(c);
            else if(c=='(')
                st.push(c);
            else if (c == ')')
            {
                while (!st.isEmpty() && st.peek() != '(')
                    System.out.print(st.pop());

                st.pop();
            }
            else {
                    while (!st.isEmpty() && priority.get(c) <= priority.get(st.peek())) {
                        System.out.print(st.pop());

                    }
                    st.push(c);
                }

        }
        while(!st.empty())
        {
            if(st.peek() == '(') {
                System.out.print("Invalid Expression");
                return;
            }
            System.out.print(st.pop());
        }

    }
    public static void main(String[] args) {
	// write your code here
        String s="a+b*(c^d-e)^(f+g*h)-i";
        setPriority();
        stackset(s);
    }
}
