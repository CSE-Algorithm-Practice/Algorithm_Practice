package 김정현.Prac_3;

import java.util.Scanner;

public class BOJ_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int temp = N;
        int count = 0;
        while(true){
                   
            int first = temp / 10;
            int second = temp % 10;
            temp = (second * 10) + (first + second) % 10; 
            count++;
            
            if(N == temp){
               break; 
            }
        }
        System.out.println(count);
        scanner.close();
	}  
}
