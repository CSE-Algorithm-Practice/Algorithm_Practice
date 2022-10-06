#include<stdio.h>


int main(void) {
    int h;
    int m;
    int t;
    scanf("%d %d", &h, &m);
    scanf("%d", &t);

    if (m + t >= 60) {
        h = h + 1;
        m = m + t - 60;
        if (m = 60) {
            h = h + 1;
            m = 0;
        }
        printf("%d %d", h, m);
    }
    else {
        printf("%d %d", h, m + t);
    }

    

    

    
    

    return 0;
}