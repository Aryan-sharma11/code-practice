package com.company;

public class Main {
    static class Node{
        int data;
        Node rchild;
        Node lchild;
        Node(int data)
        {
            this.data=data;
            rchild=null;
            lchild=null;
        }
    }
    static void delete_Node(Node n,int val)
    {
        
    }

    public static void main(String[] args) {
	// write your code here
        Node one =new Node(1);
        Node two =new Node(2);
        Node three =new Node(3);
        Node four =new Node(4);
        Node five =new Node(5);
        Node six=new Node(6);
        Node seven=new Node(7);
        Node root=one;
        one.lchild=two;
        one.rchild=three;
        two.lchild=four;
        two.rchild=five;
        three.lchild=six;
        three.rchild=seven;





    }
}
