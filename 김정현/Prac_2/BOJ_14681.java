package 김정현.Prac_2;

import java.util.Scanner;

public class BOJ_14681 {
    public static void main(String[] args) {
       int X, Y;
        Scanner scanner = new Scanner(System.in);
        X = scanner.nextInt();
        Y = scanner.nextInt();
       
       if (X > 0 && Y > 0){
        System.out.println("1");
       }
       else if (X < 0 && Y > 0){
        System.out.println("2");
       }
       else if (X < 0 && Y < 0){
        System.out.println("3");
       }
       else{
        System.out.println("4");
       }
    }
}
