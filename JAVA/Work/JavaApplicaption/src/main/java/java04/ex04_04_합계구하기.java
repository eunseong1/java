package java04;

import java.util.Scanner;

public class ex04_04_합계구하기 {
    public static void main(String[] args) {
        
        int x = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작값을 입력하세요: ");
        x = keyboard.nextInt();
        
        int y = 0;
        
        System.out.print("종료값을 입력하세요: ");
        y = keyboard.nextInt();
        
        int sum = 0;
        
        for (int i = x; i <= y; i = i + 1) {
            sum = sum + i;
        }
        System.out.println(x + "부터 " + y + " 까지의 합계는 " + sum + " 입니다");
    }
}
