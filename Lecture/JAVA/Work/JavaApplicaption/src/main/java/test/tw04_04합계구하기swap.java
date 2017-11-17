package test;

import java.util.Scanner;

public class tw04_04합계구하기swap {
    
    public static void main(String[] args) {
        
        int x = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        x = keyboard.nextInt();
        
        int y = 0;
        
        System.out.print("정수를 입력하세요: ");
        y = keyboard.nextInt();
        
        int tmp = 0;
        
        if (x > y) {
            tmp = y;
            y = x;
            x = tmp;
            
            System.out.println("x: " + x + " y: " + y);
        } else {
            System.out.println(" ");
        }
        
    }
    
}
