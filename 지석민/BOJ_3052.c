#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void) {
    int arr[9];
    int cnt = 0;
    int a;
    int rest[42];
    int temp;

    for (int j = 0; j < 42; j++) {
        rest[j] = 0;

    }
    
    for (int i = 0; i < 10; i++) {
        scanf("%d", &a);
        temp = a % 42;
        rest[temp] = 1;
    }

    for (int j = 0; j < 42; j++) {
        if (rest[j] == 1) {
            cnt++;
        }

    }

    printf("%d", cnt);

    

    return 0;
}