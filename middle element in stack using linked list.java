package com.company;
public class Main {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }
    static class DLL
    {
        Node head;
        Node tail;
        Node mid;
        int cnt=0;
        void insert(int data)
        {
            if(head==null)
            {
                Node n=new Node(data);
                head=n;
                tail=n;
                mid=head;
            }
            else
            {
                Node n=new Node(data);
                tail.next=n;
                n.prev=tail;
                tail=tail.next;
                cnt++;
                if(cnt==2)
                {
                    mid=mid.next;
                    cnt=0;
                }
            }

        }
        void pop()
        {
            int x=tail.data;
            tail=tail.prev;
            tail.next=null;
            cnt++;
            if(cnt==2)
            {
                mid=mid.prev;
            }
        }
        void show_mid()
        {
            System.out.println("MIDDLE VALUE "+ mid.data);
        }
        void delete_mid()
        {
            System.out.print("DELETED MIDDLE VALUE "+mid.data +" \n");
            mid=mid.next;
            mid.prev.prev.next=mid;
            mid.prev=mid.prev.prev;
        }
        void show_stack()
        {
            Node showstack;
            showstack =tail;
            System.out.println(" STACK IS ");
            while(showstack!=null)
            {
                System.out.println(showstack.data);
                showstack=showstack.prev;
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        DLL ll = new DLL();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);
        ll.show_stack();
        ll.show_mid();
        ll.delete_mid();
        ll.show_stack();
        ll.show_mid();
        ll.insert(8);
        ll.show_stack();

    }
}
