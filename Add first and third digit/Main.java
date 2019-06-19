#include<stdio.h>
int main()
{
  //Type your code here
  int num,f,l,sum;
  scanf("%d",&num);
  l=num%10;
  f=num/100;
  sum=l+f;
  printf("%d",sum);
  
  return 0;
}