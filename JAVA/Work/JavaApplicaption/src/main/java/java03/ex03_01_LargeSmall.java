package java03;

import java.util.Scanner;

public class ex03_01_LargeSmall {
    
    public static void main(String[] agrs) {
        
        int n = 90;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        n = keyboard.nextInt();
        
        if (n >= 100) {
            System.out.println("large");
        } else {
            System.out.println("small");
        }
    }
    
}
