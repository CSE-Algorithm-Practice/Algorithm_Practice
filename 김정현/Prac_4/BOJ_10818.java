package 김정현.Prac_4;

import java.util.Scanner;
import java.util.Arrays;

public class BOJ_10818{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int N = scanner.nextInt();
        int list[] = new int[N];

        for(int i = 0; i < N; i++){
            list[i] = scanner.nextInt();   
        }

        Arrays.sort(list);
        System.out.println(list[0] + " " + list[N-1]);      
	}  
}
