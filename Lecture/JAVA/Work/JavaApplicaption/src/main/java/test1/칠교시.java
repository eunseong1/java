package test1;

import java.util.Scanner;

public class 칠교시 {
    
    public static void main(String[] args) {
        
        Scanner p = new Scanner(System.in);
        
        System.out.print("학생수를 입력하세요");
        int a = p.nextInt();
        int[] x = new int[a];
        int add = 0;
        int avg = 0;
        
        for (int i = 0; i <= x.length - 1; i++) {
            System.out.print("성적을 입력하세요");
            x [i] = p.nextInt();
            
            add = add+ x [i];
            avg = add / a;
        }
        System.out.println("합계는" + add);
        System.out.print("평균은"+ avg);
    }
    
}
