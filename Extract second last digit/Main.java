#include<stdio.h>
int main()
{
  //Type your code here
  int a,i=0,r;
    scanf("%d",&a);
  while(i<2)
  {
    r=a%10;
    a=a/10;
    i++;
  }
  printf("%d",r);
    
  return 0;
}