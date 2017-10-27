package test1;

import java.util.Scanner;

public class 중첩 {
    public static void main(String[] args) {
        
        Scanner put = new Scanner(System.in);
        
        int sum = 0;
        for (; true;) {
            System.out.print("시작단");
            int x = put.nextInt();
            System.out.print("종료단");
            int y = put.nextInt();
            
            if (x > y) {
                
                int tmp = x;
                x = y;
                y = tmp;
                
            }
            
            if (x == 0) {
                break;
            } else if (y == 0) {
                break;
            }
            dfdf(x, y);
        }
    }
    
    public static void dfdf(int x, int y) {
        for (int i = x; i <= y; i++) {
            
            for (int j = 1; j <= 9; j++) {
                
                int sum = i * j;
                
                System.out.println(i + "x" + j + "=" + sum);
                
            }
        }
    }
}