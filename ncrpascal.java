import java.util.Scanner;

public class nCrpascals {
    public static void main(String[] args) {
        int n,r;
        System.out.println("enter n ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter r");
        r=sc.nextInt();

        System.out.println(nCR(n,r));
    }
    public static int nCR(int n,int r)
    {
        if(r==0||r==n)
        {
            return 1;
        }
        return nCR(n-1,r-1)+nCR(n-1,r);
    }
}
