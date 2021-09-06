package com.company;

import java.util.LinkedList;

public class Main {

    static class Node

    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    static class LL {
        Node head = null, tail = null;

        void insert(int data) {
            Node n = new Node(data);
            if (head == null) {
                head = n;

            } else {
                tail.next = n;

            }
            tail = n;
        }

        void find_mid() {
            Node temp1, temp2;
            temp1 = temp2 = head;
            while (temp1 != null&&temp1.next!=null) {
                temp1 = temp1.next.next;
                temp2 = temp2.next;
            }
            System.out.println("Middle element is " + temp2.data);


        }
    }
    public static void main(String[] args) {
	// write your code here
      LL l1=new LL();
      l1.insert(1);
      l1.insert(2);
      l1.insert(3);
      l1.insert(4);
      l1.insert(5);
      l1.insert(6);
     //l1.insert(7);
      l1.find_mid();
    }
}
