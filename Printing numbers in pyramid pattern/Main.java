#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int star=1;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=n-i;j++)
    {
      printf(" ");
    }
    for(int j=1;j<=i;j++)
    {
      printf("%d ",star);
      star+=1;
    }
    printf("\n");
  }
	return 0;
}