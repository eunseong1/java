package test1;

import java.util.Arrays;
import java.util.Scanner;

public class 유효점수구하기 {
    public static void main(String[] args) {
   Scanner p = new Scanner(System.in);
        
        System.out.print("심사위원의 수를 입력하시오");
        int a = p.nextInt();
        int x [] = new int [a];
        int add = 0;
        double avg = 0;
        
        System.out.print("점수 입력");
        for (int i = 0; i <= x.length-1; i++) {
            x[i] = p.nextInt();  
          
        } 
        
        Arrays.sort(x); 
        System.out.print("유효점수");
        for (int i = 1; i < x.length-1; i++) {
            
            System.out.println(x[i]);
            add = add + x[i];
            avg = (double) add / (a-2)  ;
        }
        System.out.println("합계"+add);
        System.out.printf("평균"+"%.2f%n",avg );
    }
}
