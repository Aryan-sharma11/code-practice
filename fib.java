import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        int n,a,b;
        System.out.println("enter the number of terms");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        a=0;b=1;
        fib(a,b,n);

    }
    public static int fib(int a, int b,int n)
    {
        if(n==0)
            return 0;
        System.out.println(a);
        return fib(b,a+b,n-1);

    }
}

