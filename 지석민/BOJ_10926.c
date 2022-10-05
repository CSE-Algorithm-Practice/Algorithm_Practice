#include<stdio.h>
#include<string.h>

int main(void){
    char str1[] = "";
    char str2[] = "??!";
    scanf("%s", str1);

    printf("%s", strcat(str1, str2));

    return 0;
}