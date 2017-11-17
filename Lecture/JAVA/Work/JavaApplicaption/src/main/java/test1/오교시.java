package test1;

import java.util.Arrays;

public class 오교시 {
    public static void main(String[] args) {
        
        String a = "74 874 9883 73 9 73646 774";
        int s = 0;
        double avg = 0;
        String x[] = a.split(" ");
        int z[] = new int[x.length];
        
        
        for (int i = 0; i <=  x.length - 1; i++) {
            z[i] = Integer.valueOf(x[i]);
            s = s + z[i];
            avg = s / x.length; 
        }
        Arrays.sort(z); //정렬
        
        System.out.println("합계 :" + s);
        System.out.println("평균: "  + avg);
        System.out.println("최대값" + z[x.length-1]);
        System.out.println("최소값"+ z[0]);
            
            
        
        
    }
}
