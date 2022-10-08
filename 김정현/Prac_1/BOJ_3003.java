package 김정현.Prac_1;

import java.util.Scanner;

public class BOJ_3003 {
	public static void main(String[] args) {
		int A = 1, B = 1, C = 2, D = 2, E = 2, F = 8 ;
		int a, b, c, d, e, f;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		e = scanner.nextInt();
		f = scanner.nextInt();
		
		System.out.print(A - a + " ");
		System.out.print(B - b + " ");
		System.out.print(C - c + " ");
		System.out.print(D - d + " ");
		System.out.print(E - e + " ");
		System.out.print(F - f);	
	}
}