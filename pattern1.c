#include<stdio.h>
int main()
{
    int i,j,k,m;
    for(i=1;i<=5;i++)
    {
       for(j=1;j<=5-i;j++)
        printf(" ");
       for(k=i;k!=(i*2)-1;k++)
        printf("%d",k);
        m=k-1;
       for(k-1;k>m/2;k--)
       printf("%d",k);
     printf("\n");
   }
    return 0;
}
