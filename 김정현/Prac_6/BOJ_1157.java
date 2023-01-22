package 김정현.Prac_6;

import java.util.Scanner;

public class BOJ_1157 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];

        String word = scanner.next();
       
        for(int i = 0; i < word.length(); i++){
            if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z'){ //대문자 범위
                arr[word.charAt(i) - 'A']++; //해당 인덱스 값을 1 증가
            }
            else{ //소문자 범위
                arr[word.charAt(i) - 'a']++;
            }

        }

        int max = 0;
        char ch = '?';

        for(int i = 0; i < 26; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char) (i + 65); //65를 더해 대문자로 변환
            }
            else if (arr[i] == max){
                ch = '?';
            }
        }

        System.out.print(ch);
        scanner.close();
    }
    
}
