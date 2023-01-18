package 김정현.Prac_5;

import java.util.Scanner;

public class BOJ_1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int result = test(scanner.nextInt());
        System.out.print(result);
        scanner.close();

    }
    public static int test(int num){
        int count = 0;

        if (num < 100) {
            return num;
        }
        else{
            count = 99;
            for(int i = 100; i <= num; i++){
                int third = i / 100;
                int second = (i/10) % 10;
                int first = i % 10;

                if((third - second) == (second - first)){
                    count++;
                }
            }
        }
        return count;
    }
}

