#include <stdio.h>
#include <string.h>

//ASCII에서 O는 079, X는 088이다. 

int main(int argc, char *argv[]){
	int num;
	scanf("%d", &num);
	
	char ch[101];
	int i=0;//for문을 돌리기 위한 i선언
	int j=0;
	int count=0;//O 더하기용
	int sum=0;
	int sum1[101];
	
	for(i=0; i<num; i++){
		//매번 입력할때마다 변수의 초기화 선언을 해줘야 한다.
		count=0; 
		scanf("%s", ch);
		sum=0;
		for(j=0; j<strlen(ch); j++){
			if(ch[j]==79){//O일 경우 
				count = count + 1;//연속해서 O이 오면 1+2형식으로 동작한다 
				sum = sum + count;//count1의 총합을 계산한다 
			}
			else if(ch[j]==88){//X일 경우 
				count = 0;//X가 오면 count1은 다시 0부터 시작한다 
				sum = sum + count;
			}
		}
		sum1[i] = sum;
	}
	for(i=0; i<num; i++){
		printf("%d\n", sum1[i]);
	}
	
	return 0;
}
