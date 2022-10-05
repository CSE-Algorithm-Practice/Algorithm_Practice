#include<stdio.h>

int main(void){
    int a;
    int b;

    scanf("%d %d", &a, &b);

    printf("%f", (double)a/(double)b);

    return 0;
}