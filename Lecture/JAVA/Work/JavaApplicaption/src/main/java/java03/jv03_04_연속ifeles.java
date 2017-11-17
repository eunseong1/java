package java03;

import java.util.Scanner;

public class jv03_04_연속ifeles {
    public static void main(String[] agrs) {
        
        int grade = 95;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("점수를 입력하세요:");
        grade = keyboard.nextInt();
        
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
    }
}
