package 김정현.Prac_2;

import java.util.Scanner;

public class BOJ_9498 {
    public static void main(String[] args) {
       int scores;
        Scanner scanner = new Scanner(System.in);
       scores = scanner.nextInt();
       
       if (scores <= 100 && scores >= 90){
        System.out.println("A");
       }
       else if(scores >= 80) {
        System.out.println("B");
       }
       else if(scores >= 70){
        System.out.println("C");
       }
       else if(scores >= 60){
        System.out.println("D");
       }
       else{
        System.out.println("F");
       }
    }
}