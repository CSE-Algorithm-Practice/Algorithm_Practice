#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void) {
   
    int a = 0;
    int score[1001];
    int max = 0;
    double avg = 0;

    scanf("%d", &a);

    for (int i = 0; i < a; i++) {
        scanf("%d", &score[i]);
        if (max < score[i]) {
            max = score[i];
        }
    }

    for (int j = 0; j < a; j++) {
        
        avg = avg + (((double)score[j] / max) * 100);

    }

    printf("%f", avg / a);
    

    return 0;
}