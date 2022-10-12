package 김정현.Prac_4;

import java.util.Scanner;

public class BOJ_3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int list[] = new int[10];
        boolean result;
        int count = 0;

        for(int i = 0; i <= 9; i++){
            list[i] = scanner.nextInt() % 42;  
        }

        for(int k = 0; k <= 9; k++){
            result = false;
            for(int j = k+1; j <= 9; j++){
                if(list[k] == list[j]){
                    result = true;
                    break;
                }
            }
            if(result == false){
                count++;
            }
        }

        System.out.println(count);
	}  
}
