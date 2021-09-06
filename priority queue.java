package com.company;

public class Main {
     static class Node{
        int data,priority;
        Node next;
        Node prev;
        Node(int data,int priority)
        {
            this.data=data;
            this.priority=priority;
            next=null;
            prev=null;
        }
    }
    static class priority_Queue
    {
        Node head,tail;
        priority_Queue()
        {
            head=tail=null;
        }
        void enqueue(int data, int priority) {
            Node q = new Node(data, priority);
            if (head == null) {
                head=tail=q;

            }
            else
            {
                tail.next=q;
                tail.next.prev=tail;
                tail=q;
            }
        }
        void dequeue()
        {
            int x;
            x=tail.data;
            tail.prev.next=null;
             Node q=tail.prev;
             tail.prev=null;
             tail=q;
             System.out.println("dequed element "+ x);
        }
        void get_highestpriority()
        {
            Node q,max;
            max=new Node(0,0);
            q=head;
            while(q!=null)
            {
                if(max.priority<q.priority)
                    max=q;
                q=q.next;
            }
            System.out.println("Max priority element is " + max.data);
        }
        void delete_highest(){

            Node q,max;
            max=new Node(0,0);
            q=head;
            while(q!=null)
            {
                if(max.priority<q.priority)
                    max=q;
                q=q.next;
            }
            System.out.println("data going to be deleted is "+max.data );
            Node r;
            r=max.prev;
            max.prev.next=null;
            max.prev=null;
            max=r;
    }


    }

    public static void main(String[] args) {
	// write your code here
        priority_Queue q =new priority_Queue();
        q.enqueue(2,1);
        q.enqueue(3,4);
        q.enqueue(4,5);
        q.enqueue(10,2);
        q.enqueue(5,3);
        q.enqueue(6,6);
        q.enqueue(7,7);
        q.dequeue();
        q.get_highestpriority();
        q.delete_highest();
        q.get_highestpriority();


    }
}
