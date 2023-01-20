package 김정현.Prac_6;

import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String n = scanner.next();

        int sum = 0;
        scanner.close();

        for(int i = 0; i < input; i++){
            sum += n.charAt(i) - '0';
        }
        System.out.println(sum);
        
    }
}
