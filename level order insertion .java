package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static class Node{
        int data;
        Node lchild;
        Node rchild;
        Node(int data)
        {
            this.data=data;
            lchild=null;
            rchild=null;
        }
    }
    static Queue<Node> levelorder=new LinkedList<Node>();
    static Node root;
    static Node temp=root;



       static void insertion(Node temp ,int key)
        {
            if(temp==null)
            {
                root=new Node(key);
                return;

            }
            levelorder.add(temp);
            while(!levelorder.isEmpty())
            {
                temp=levelorder.poll();
                if(temp.lchild==null) {
                    temp.lchild = new Node(key);
                    break;
                }
                else
                    levelorder.add(temp.lchild);
                if((temp.rchild==null))
                {
                    temp.rchild=new Node(key);
                    break;
                }
                else
                    levelorder.add(temp.rchild);


            }
        }
        static void inorder(  Node root)
        {
            if(root==null)
            {
                return;
            }
            inorder(root.lchild);
            System.out.println(root.data);
            inorder(root.rchild);
        }

        static void deletion(root)
        {

        }


    public static void main(String[] args) {
	// write your code here
        root = new Node(10);
        root.lchild = new Node(11);
        root.lchild.lchild = new Node(7);
        root.rchild = new Node(9);
        root.rchild.lchild = new Node(15);
        root.rchild.rchild = new Node(8);
        inorder(root);
        insertion(root,12);
        inorder(root);
    }
}
