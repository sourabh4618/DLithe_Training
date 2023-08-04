// Online C compiler to run C program online
#include <stdio.h>

int main()
{
    // Write C code here
    int range;
    printf("Enter the range of the prime number");
    scanf("%d", &range);
    for (int i = 2; i <= range; i++)
    {
        int flag = 0;
        for (int j = 2; j < i; j++)
        {
            if (i % j == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            printf(" %d ", i);
    }
}