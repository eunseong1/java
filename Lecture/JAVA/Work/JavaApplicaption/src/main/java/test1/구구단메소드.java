package test1;

import java.util.Scanner;

public class 구구단메소드 {
    
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        
        for (; true;) {
            System.out.print("시작단 : ");
            int x = q.nextInt();
            System.out.print(" 종료단 : ");
            int y = q.nextInt();
            
            int s = 0;
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
            add(x, y);
        }
        
    }

    public static void add(int x, int y) {
        int s;
        for (int i = x; i <= y; i++) {
            for (int j = 1; j <= 9; j++) {
                s = i * j;
                
                System.out.println(s);
            }
        }
    }
}
