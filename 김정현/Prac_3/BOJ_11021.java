package 김정현.Prac_3;

import java.util.Scanner;

public class BOJ_11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int count = 1;

        int result[] = new int[T];

        for (int i = 0; i < T; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            result[i] = A + B;
        }

        for (int k : result) {
            System.out.println("Case #" + count + ": " + k);
            count++;
        }
	}  
}
