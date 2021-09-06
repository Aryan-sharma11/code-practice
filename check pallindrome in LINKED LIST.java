package com.company;

import org.w3c.dom.Node;

import java.awt.*;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    Stack<Character> st=new Stack<>();
    static class Node{
        char data;
        Node next;
        Node(char data)
        {
            this.data=data;
            next=null;
        }
    }
   static boolean check_Pallindrome(Node head)//using Stack
    {
        Stack<Character> st1=new Stack<>();
        Node q;
        q=head;
        while(q!=null) {
            st1.push(q.data);
            q=q.next;
        }
        q=head;
        while(q!=null)
        {
            if(q.data!=st1.pop())
                return false;
            q=q.next;
        }
        return true;
    }
   static Node head;
    static Node left;
    static boolean check_pallindrome2(Node right)
    {
        left=head;
        if(right==null)
            return true;
        boolean check1=check_pallindrome2(right.next);

        if(check1==false)
            return false;
        boolean check2=left.data==right.data;

        left=left.next;
        return check2;
    }
    public static void main(String[] args) {
	// write your code here
        Node one =new Node('r');
        Node two =new Node('a');
        Node three =new Node('d');
        Node four =new Node('a');
        Node five=new Node('d');
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        head=one;
       System.out.println(check_Pallindrome(one));
       System.out.println(check_pallindrome2(one));
    }
}
