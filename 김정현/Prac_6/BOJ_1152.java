package 김정현.Prac_6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1152 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        String word = scanner.nextLine();
        scanner.close();
        StringTokenizer st = new StringTokenizer(word, " ");
        System.out.print(st.countTokens());
    }
}
