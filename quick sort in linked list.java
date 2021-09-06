package com.company;

public class Main {

    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    void partition(Node head)
    {
        Node pivot=head;
        while(pivot.next!=null)
        {
            pivot=pivot.next;
        }
    }
    void quicksort(Node head)
    {


    }

    public static void main(String[] args) {
	// write your code here
        Node one =new Node(1);
        Node two=new Node(5);
        Node three=new Node(4);
        Node four=new Node(10);
        Node five =new Node(2);
        Node six=new Node(6);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        quicksort(one);
    }
}
