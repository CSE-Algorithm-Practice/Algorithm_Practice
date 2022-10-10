package 김정현.Prac_3;

import java.util.Scanner;

public class BOJ_2439 {
    public static void main (String arg[]){
        Scanner scanner = new Scanner(System.in);
        
        int num  = scanner.nextInt();
        scanner.close();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
