import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Main {

    static class Stack
    {
        char [] stac=new char [30];
        int ref=0;
        int d=0;
       public  void push(char a)
        {
            System.out.println("push "+ a);
            stac[d]=a;
            d++;
        }
        public void pop(char a)
        {
            System.out.println("pop "+ a);
            if((a=='}'&&stac[d-1]=='{')||(a==')'&&stac[d-1]=='(')||(a==']'&&stac[d-1]=='[')&&(d>=0))
            {

                d--;
                System.out.println(d);
            }
            else
                ref=1;

        }
    };
    public static void main(String[] args) {
        Stack st = new Stack();

        char[] stack=new char [50];
        Scanner sc=new Scanner(System.in);
        int i=0;
        stack=sc.next().toCharArray();
        for(i=0;i<stack.length;i++)
        {
            if(stack[i]=='('||stack[i]=='{'||stack[i]=='[')
            {

                st.push(stack[i]);
            }
            else
            {
                st.pop(stack[i]);

            }


            if(st.ref==1)
            {
                break;
            }
        }
        if(st.ref==1)
        {
            System.out.println(" broken");
        }
        else
            System.out.println("not broken");

    }
	// write your code here

}
