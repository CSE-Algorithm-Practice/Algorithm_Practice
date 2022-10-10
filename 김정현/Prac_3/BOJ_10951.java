package 김정현.Prac_3;

import java.util.Scanner;

public class BOJ_10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()){
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A + B);
        }
        scanner.close();
	}  
}
