package 김정현.Prac_3;

import java.util.Scanner;

public class BOJ_2739 {
    public static void main(String[] args) {
		int input;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		for(int i = 1 ; i <= 9; i++){
            System.out.println(input + " * " + i + " = " + input * i);
        }
	}  
}
