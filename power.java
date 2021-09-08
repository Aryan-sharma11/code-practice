import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class power {
    public static int pow(int num,int p)
    {
        if(p==0)
            return 1;
        if(p%2==0)
            return  pow(num*num,p/2);
        else
            return num*pow(num*num(p-1)/2);
    }
    public static void main(String[] args) {
        int num;
        int p,result;
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("enter the power");
        p=sc.nextInt();
        result=pow(num,p);
        System.out.println(result);

    }
}
