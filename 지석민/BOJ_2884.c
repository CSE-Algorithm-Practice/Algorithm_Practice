#include<stdio.h>


int main(void) {
    int h;
    int m;
    scanf("%d %d", &h, &m);

    if (m - 45 < 0) {
        h = h - 1;
        m = 60 + m - 45;
        printf("%d %d", h, m);
    }
    else {
        printf("%d %d", h, m - 45);
    }

    

    
    

    return 0;
}