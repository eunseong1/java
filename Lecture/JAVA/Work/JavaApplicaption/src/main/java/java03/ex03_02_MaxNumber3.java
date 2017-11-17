package java03;

import java.util.Scanner;

public class ex03_02_MaxNumber3 {
    public static void main(String[] args) {
        
        int x = 1;
        int y = 4;
        int z = 5;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하세요");
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        z = keyboard.nextInt();
        
        if (x > y) {
            if (x > z) {
                System.out.println(y);
            } else {
                System.out.println(z);
            }
        } else {
            if (y > z) {
                System.out.println(z);
            } else {
                System.out.println(y);
            }
        }
    }
}
