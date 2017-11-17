package 어은성;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        
        for (; true;) {
            
            System.out.print("시작단을 입력하세요 : ");
            int x = s.nextInt();
            System.out.print("종료단을 입력하세요 : ");
            int y = s.nextInt();
            
            if (x > y) {
                int t = x;
                x = y;
                y = t;
            }
            
            if (x == 0) {
                break;
            } else if (y == 0) {
                break;
            }
            
            for (int i = x; i <= y; i++) {
                for (int j = 1; j <= 9; j++) {
                    sum = i * j;
                    System.out.println(i + "x" + j + " = " + sum);
                }
            }
        }
        
    }
}
