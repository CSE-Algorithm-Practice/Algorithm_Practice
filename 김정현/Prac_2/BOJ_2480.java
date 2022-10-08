package 김정현.Prac_2;

import java.util.Scanner;

public class BOJ_2480 {
    public static void main(String[] args) {
       int first, second, third;
       Scanner scanner = new Scanner(System.in);

       first = scanner.nextInt();
       second = scanner.nextInt();
       third = scanner.nextInt();
       
       if((first == second) && (first == third) && (second == third)){
        System.out.println(10000 + (first) * 1000);
       }
       else if ((first != second) && (first != third) && (second != third) ){
        if (first > second && first > third){
            System.out.println(first * 100);
        }
        else if (second > first && second > third){
            System.out.println(second * 100);
        }
        else{
            System.out.println(third * 100);
        }
       }
       else {
        if (first == second && first != third){
            System.out.println(1000 + first*100);
        }
        else if (first == third && first != second){
            System.out.println(1000 + first*100);
        }
        else if (second == third && second != first){
            System.out.println(1000 + second*100);
        }
       }
    }
}
