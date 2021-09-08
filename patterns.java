public class patterns {

        public static void main(String[] args) {


            int i,j,k,m;
            for(i=1;i<=5;i++)
            {
                for(j=1;j<=5-i;j++)
                    System.out.print(" ");
                for(k=i;k!=(i*2)-1;k++)
                    System.out.print(k);
                m=k-1;
                for(;k>m/2;k--)
                    System.out.print(k);
                System.out.println(" ");
            }

        }
    }


