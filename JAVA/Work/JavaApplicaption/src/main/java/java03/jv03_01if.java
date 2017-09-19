package java03;

import java.util.Scanner;

public class jv03_01if {
    
    public static void main(String[] agrs) {
        
        int grade = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        grade = keyboard.nextInt();
        
        if (grade >= 60) {
            
            System.out.println("합격입니다");
            System.out.println("장학금도 받을 수 있습니다");
        }
        
    }
    
}
