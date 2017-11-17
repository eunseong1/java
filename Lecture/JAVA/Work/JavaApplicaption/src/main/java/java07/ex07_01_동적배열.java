package java07;

import java.util.Scanner;

public class ex07_01_동적배열 {
    public static void main(String[] args) {
        
        int s = 0;
        
        
        
        Scanner put = new Scanner(System.in);
        System.out.print("입력하시오: ");
        s = put.nextInt();
        
        int [] num = new int[s];
        
        System.out.println(num.length);
    }
}
