import java.util.Scanner;

public class nCr {
    public static void main(String[] args) {
        int n,r;
        System.out.println("enter n ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter r");
        r=sc.nextInt();

        System.out.println(fact(n)/(fact(r)*fact(n-r)));
    }
    public static int fact(int f)
    {
        if(f==1)
        {
            return 1;
        }
        return f*fact(f-1);
    }
}
