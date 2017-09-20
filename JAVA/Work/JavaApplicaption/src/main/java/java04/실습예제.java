package java04;

import java.util.Scanner;

public class 실습예제 {
    public static void main(String[] args) {
        
        int n1 = 2;
        int n2 = 6;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        
        int sum = 0;
        
        for (int i = n1; i <= n2; i = i + 1) {
            sum = sum + i;
            System.out.print(i);
            if (i == 6) {
                System.out.print("=");
            } else {
                System.out.print("+");
            }
            
        }
        System.out.println(sum);
    }
}
