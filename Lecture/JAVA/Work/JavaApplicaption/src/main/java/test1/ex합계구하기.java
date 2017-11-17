package test1;

import java.util.Scanner;

public class ex합계구하기 {
    public static void main(String[] args) {
        
        Scanner put = new Scanner(System.in);
        
        System.out.print("시작값");
        int x = put.nextInt();
        
        System.out.print("종료값");
        int y = put.nextInt();
        
        int sum = 0;
        if (x > y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        for (int i = x; i <= y; i++) {
            sum = sum + i;
        }
        
        System.out.println(x + "시작값" + y + "종료값" + sum);
        
    }
}
