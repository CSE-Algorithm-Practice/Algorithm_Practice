package 김정현.Prac_3;

import java.util.Scanner;

public class BOJ_25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int X = scanner.nextInt();
        int num = scanner.nextInt();
        
        int result = 0;
		for (int i = 1; i <= num; i++){
            

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            result = result + a * b;
            
        }
        scanner.close();

        if (result == X) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
        
	}  
}
