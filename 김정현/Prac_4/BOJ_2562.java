package 김정현.Prac_4;

import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int list[] = new int[9];
        int max = list[0];
        int count = 0;
        int count2 = 0;

        for(int i = 0; i < 9; i++){
            list[i] = scanner.nextInt();   
        }

        for(int k = 0; k < 9; k++){
            count++;
            if(list[k] > max){
                max = list[k];
                count2 = count;
            }
        }

        System.out.println(max + " " + count2);
       
	}  
}
