package 김정현.Prac_4;

import java.util.Scanner;

public class BOJ_8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String list[] = new String[scanner.nextInt()];
    
        for(int i = 0; i < list.length; i++){
            list[i] = scanner.next();  
        }
        
        for(int k = 0; k < list.length; k++){
            int count = 0, sum = 0;
            for(int j = 0; j < list[k].length(); j++){
                if(list[k].charAt(j) == 'O'){
                    count++;
                }
                else{
                    count = 0;
                }
                sum += count;
        
            }

            System.out.println(sum);
        }
       
        
	}  
}
