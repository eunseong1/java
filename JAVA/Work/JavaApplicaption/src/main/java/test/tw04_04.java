package test;

import java.util.Scanner;

public class tw04_04 {
    
    public static void main(String[] args) {
        
        int x = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");
        x = keyboard.nextInt();
        
        int y = 0;
        
        System.out.print("정수를 입력하시오: ");
        y = keyboard.nextInt();
        
        int sum = 0;
        
        if (x > y) {
            for (int i = y; x > y; i = i + 1) {
                sum = sum + i;
            }
            System.out.println(y + "부터" + x + "합계는" + sum + "입니다");
        } else {
            for (int i = x; x <= y; i = i + 1) {
                sum = sum + i;
            }
            System.out.println(x + "부터" + y + "합계는" + sum + "입니다");
        }
    }
    
}
