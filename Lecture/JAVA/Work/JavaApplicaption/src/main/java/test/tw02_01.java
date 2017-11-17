package test;

import java.util.Scanner;

public class tw02_01 {
    public static void main(String[] args) {
        
        double w = 10;
        double h = 5;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        w = keyboard.nextInt();
        h = keyboard.nextInt();
        
        
        double area = w * h;
        double perimeter = 2 * (w + h);
        
        System.out.println("사각형의 넓이 : " + area);
        System.out.println("사각형의 둘레 : " + perimeter);
        
    }
}
