package 김정현.Prac_4;

public class BOJ_15596{
    long sum(int[] a){
        long sum = 0;
        
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
