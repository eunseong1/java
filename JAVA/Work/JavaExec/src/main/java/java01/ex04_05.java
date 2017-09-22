package java01;

import java.util.Scanner;

public class ex04_05 {
    public static void main(String[] args) {
        int s = 0;
        int x = 0;
        int y = 0;
        int tmp = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        x = keyboard.nextInt();
        
        System.out.print("정수를 입력하세요 : ");
        y = keyboard.nextInt();
        
        if (x > y) {
            tmp = y;
            y = x;
            x = tmp;
            for (int i = x; i <= y; i = i + 1) {
                s = s + i;
            }
        }
        
        System.out.println(s);
    }    
}
