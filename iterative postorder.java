package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right;
        }
    }

    static class BinaryTree {
        Node root;
        ArrayList<Integer> tree = new ArrayList<Integer>();

        // An iterative function to do postorder traversal
        // of a given binary tree
       public ArrayList<Integer> postOrder(Node node) {
            Stack<Node> Store = new Stack<Node>();

            // Check for empty tree
            if (node == null)
                return tree;
            Store.push(node);
            Node prev = null;
            while (!Store.isEmpty()) {
                Node current = Store.peek();

            /* go down the tree in search of a leaf an if so process it
            and pop stack otherwise move down */
                if (prev == null || prev.left == current ||
                        prev.right == current) {
                    if (current.left != null)
                        Store.push(current.left);
                    else if (current.right != null)
                        Store.push(current.right);
                    else {
                        Store.pop();
                        tree.add(current.data);
                    }

                /* go up the tree from left node, if the child is right
                push it onto stack otherwise process parent and pop
                stack */
                } else if (current.left == prev) {
                    if (current.right != null)
                        Store.push(current.right);
                    else {
                        Store.pop();
                        tree.add(current.data);
                    }

                /* go up the tree from right node and after coming back
                from right node process parent and pop stack */
                } else if (current.right == prev) {
                    Store.pop();
                    tree.add(current.data);
                }

                prev = current;
            }

            return tree;
        }
        }

        public static void main(String args[]) {
            BinaryTree tree = new BinaryTree();

            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);
            tree.root.right.left = new Node(6);
            tree.root.right.right = new Node(7);

            ArrayList<Integer> PO_TREE = tree.postOrder(tree.root);

            System.out.println("Post order traversal :- ");
            System.out.println(PO_TREE);
        }
    }

