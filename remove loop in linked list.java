package com.company;

public class Main {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            next=null;
            this.data=data;
        }
    }
    static class LL{
        Node head;
        Node tail;
        LL()
        {
            head=null;
            tail=null;
        }
        void insert_node(int data)
        {
            Node p= new Node(data);
            if(head==null&&tail==null)
            {
                head=tail=p;
            }
            else
            {
                tail.next=p;
                tail=p;
            }
        }
        void create_loop()
        {
            tail.next=head.next.next.next;
        }

          boolean detect_Loop()
        {
            Node fast,slow;
            fast=head;
            slow=head;

            while(fast!=null&&fast.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
                if(slow==fast)
                    break;
            }
            if(slow!=fast)
                return false;

            int cnt=0;
            while(slow.next!=fast)
            {
                slow=slow.next;
                cnt++;
            }
            Node ptr1,ptr2;
            ptr1=ptr2=head;
            while(cnt>0)
            {
             ptr2=ptr2.next;
             cnt--;
            }
            while(ptr2.next!=ptr1)
            {
                ptr1=ptr1.next;
                ptr2=ptr2.next;
            }

            ptr2.next=null;
            return true;
        }
        void display()
        {
            Node q;
            q=head;
            while(q!=null)
            {
                System.out.println(q.data);
                q=q.next;
            }
        }

    }

    public static void main(String[] args) {
	// write your code here
        LL l1=new LL();
        l1.insert_node(1);
        l1.insert_node(2);
        l1.insert_node(3);
        l1.insert_node(4);
        l1.insert_node(5);
        l1.insert_node(6);
        l1.insert_node(7);
        l1.insert_node(8);

      //  l1.create_loop();

        if(l1.detect_Loop())
            System.out.println("LOOP FOUND AND REMOVED");
        else
            System.out.println("loop not found");
        l1.display();



    }
}
