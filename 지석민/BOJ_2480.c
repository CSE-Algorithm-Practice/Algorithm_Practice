#include<stdio.h>


int main(void) {
    int a;
    int b;
    int c;
    scanf("%d %d %d", &a, &b, &c);

    if (a == b && a == c && b == c) {
        printf("%d", 10000 + a * 1000);
    }
    else if (a==b && a!=c) {
        printf("%d", 1000 + a * 100);
    }
    else if (a == c && a != b) {
        printf("%d", 1000 + a * 100);
    }
    else if (c == b && a != a) {
        printf("%d", 1000 + c * 100);
    }
    else if (a != b != c){
        int max = 0;
        if (max < a) {
            max = a;
            if (max < b) {
                max = b;
                if (max < c) {
                    max = c;
                }
            }
        }

        printf("%d", max * 100);
    }

    

    

    
    

    return 0;
}