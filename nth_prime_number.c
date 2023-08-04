// Online C compiler to run C program online
#include <stdio.h>

int main()
{
    // Write C code here
    int count = 1;
    int k = 2;
    int prime = 2;
    while (count != k)
    {
        int flag = 0;
        prime++;
        for (int i = 2; i <= prime / 2; i++)
        {
            if (prime % i == 0)
            {
                flag = 1;
            }
        }
        if (flag == 0)
            count++;
    }
    printf("%d", prime);
}