#include <stdio.h>
#include <stdlib.h>
#include <string.h>
char stac[30];
int ref=0;
int d=0;
void push(char a)
{
         printf("push %c",a);
    stac[d]=a;
    d++;
}
void pop(char a)
{
    printf("pop %c",a);
    if((a=='}'&&stac[d-1]=='{')||(a==')'&&stac[d-1]=='(')||(a==']'&&stac[d-1]=='[')&&(d>=0))
      {

      d--;
       printf("%d",d);
      }
    else
        ref=1;

}

int main()
{
   char stack[50];
   int i=0;
   gets(stack);
   for(i=0;i<strlen(stack);i++)
   {
       if(stack[i]=='('||stack[i]=='{'||stack[i]=='[')
            {

                push(stack[i]);
            }
            else
            {
                pop(stack[i]);

            }


             if(ref==1)
            {
                break;
            }
   }
   if(ref==1)
   {
    printf(" broken");
   }
       else
        printf("not broken");
    return 0;
}
