package java04;

import java.util.Scanner;

public class ex04_14_구구단 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        for (; true;) {
            
            int x = 0;
            int y = 0; // 입력받게 해주는거
            int tmp = 0;
            
            System.out.print("시작단을 입력하세요: ");
            x = keyboard.nextInt();
            System.out.print("끝단을 입력하세요");
            y = keyboard.nextInt();
            
            if (x > y) {
                tmp = y; // 시작단이 종료단 보다 큰 경우에도 가능하게 하시오
                y = x;
                x = tmp;
                
            }
            if (x == 0 || y == 0) { // 입력 받는 정수에 0 이 있는 경우에만 프로그램을 종료하고 아니면
                                    // 계속 새로운 시작단과 종료단를 입력 받아 출력하게 하시오.
                System.out.println("종료합니다");
                break;
            }
            for (int i = x; i <= y; i = i + 1) {
                for (int j = 1; j <= 9; j = j + 1) { // 구구단
                    int s = i * j;
                    System.out.println(i + "*" + j + "=" + s);
                }
            }
        }
        
    }
}
