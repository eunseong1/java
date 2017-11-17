package java04;

import java.util.Scanner;

public class ex04_12_구구단3 {
    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        Scanner key = new Scanner(System.in);
        System.out.print("시작 단수를 입력하세요: ");
        x = key.nextInt();
        System.out.print("종료단수를 입력하세요: ");
        y = key.nextInt();
        
        if (x <= 0) {
            for (int i = x; i <= y; i = i + 1) {
                for (int j = 1; j <= 9; j = j + 1) {
                    int s = i * j;
                    System.out.println(x + "*" + y + "=" + j);
                }
            }
        } else {
            for (int i = y; i <= x; i = i + 1) {
                for (int j = 1; j <= 9; j = j + 1) {
                    int s = i * j;
                    System.out.println(x + "*" + y + "=" + j);
                    break;
                }
                
            }
        }
    }
}
