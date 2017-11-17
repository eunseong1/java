package java03;

import java.util.Scanner;

public class ex03_02_MaxNumber4 {
    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        int z = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        z = keyboard.nextInt();
        
        if ((x < z) && (x == y)) {
            System.out.println(z);
        } else if (x < z) {
            System.out.println(z);
        } else {
            System.out.println("제일 큰 수는 " + z + "입니다");
        }
    }
}
