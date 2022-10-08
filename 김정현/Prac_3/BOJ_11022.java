package 김정현.Prac_3;

import java.util.Scanner;

public class BOJ_11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1, num = 0;
        int a[] = new int[N];
        int b[] = new int[N];
        int result[] = new int[N];
        
        for (int i = 0; i < N; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            a[i] = A;
            b[i] = B;
            result[i] = A + B;
        }

        for (int k : result) {
            System.out.println("Case #" + count + ": " + a[num] + " + " + b[num] + " = " + k);
            count++;
            num++;
        }
	}  
}
