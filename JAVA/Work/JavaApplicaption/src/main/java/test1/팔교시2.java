package test1;

import java.util.Arrays;
import java.util.Scanner;

public class 팔교시2 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.print("심사위원의 수를 입력하세요");
        
        int x = p.nextInt();
        int a [] = new int [x];
        int 합계 = 0;
        double d = 0;
        
        System.out.print(" 점수를 입력하세요");
        
        for (int i = 0; i <= a.length-1; i++) {
            a[i] = p.nextInt();
        }
        
        Arrays.sort(a);
        System.out.println("유효점수");
        for (int i = 1; i < a.length -1; i++) {
            
            System.out.println(a[i]);
            합계 = a[i] + 합계;
            d = (double)합계 / (x-2);
            
        }
        System.out.printf("%.2f%n" ,d);
        System.out.println("합계 " +합계);
    }
}
