package 김정현.Prac_2;

import java.util.Scanner;

public class BOJ_2525 {
    public static void main(String[] args) {
       int H, M;
       int timer; 
       Scanner scanner = new Scanner(System.in);
        H = scanner.nextInt();
        M = scanner.nextInt();
        timer = scanner.nextInt();

        int min = 60 * H + M;
        min += timer;
        
        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}
