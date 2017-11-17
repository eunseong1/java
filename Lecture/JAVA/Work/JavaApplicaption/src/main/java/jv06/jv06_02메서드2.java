package jv06;

public class jv06_02메서드2 {
    
    public static int getsum(int start, int end) {
        
        int sum = 0;
        
        for (int i = start; i <= end; i = i + 1) {
            sum = sum + i;
            
        }
        return sum;
        
    }
    
    public static void main(String[] args) {
        
        int sum = getsum(1, 10);
        
        System.out.println(sum);
        
        int sum2 = getsum(1, 100);
        
        System.out.println(sum2);
        
        int sum3 = getsum(100, sum2);
        
        System.out.println(sum3);
    }
}
