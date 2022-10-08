package 김정현.Prac_2;

import java.util.Scanner;

public class BOJ_2753 {
    public static void main(String[] args) {
       int year;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
       
       if (year % 4 ==0 && (year % 100 != 0 || year % 400 == 0)){
        System.out.println("1");
       }
       else{
        System.out.println("0");
       }
    
    }
}