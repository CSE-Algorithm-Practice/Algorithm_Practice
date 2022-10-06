package 김정현.Prac_2;

import java.util.Scanner;

public class BOJ_2884 {
    public static void main(String[] args) {
       int H, M;
        Scanner scanner = new Scanner(System.in);
        H = scanner.nextInt();
        M = scanner.nextInt();
       
       
        if( H == 0 && M < 45){
            M = M + 60;
            System.out.println((H+23) + " " + (M-45));
        }
        else if ((H > 0 && H <= 23)){
            if(M < 45){
                M = M + 60;
                System.out.println((H-1) + " " + (M - 45));
            }
            else if (M >= 45){
                System.out.println((H) + " " + (M - 45));
            }
            
        }

    }
}