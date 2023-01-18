package 김정현.Prac_5;

public class BOJ_4673{

    public static void main(String[] args) {
        
        boolean [] a = new boolean[10001];

        for(int i = 1; i < 10001; i++){
            int n = test(i);
            
            if (n < 10001){
                a[n] = true;
            }
        }
        for(int x = 1; x < 10001; x++){
            if (a[x] == false){
                System.out.println(x);
            }
        }       
        
        
    }

    public static int test(int num) {
        int sum = num;
        while( num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    
}
