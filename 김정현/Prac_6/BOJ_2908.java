package 김정현.Prac_6;

import java.util.Scanner;

public class BOJ_2908 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        scanner.close();

        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
        
        System.out.println(a > b ? a : b);

    }
}
