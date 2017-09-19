package test;

import java.util.Scanner;

public class tw01_03 {
    public static void main(String[] args) {
        
        int salary = 120;
        int deposit = salary * 120;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("월급을 입력하시오 : ");
        salary = keyboard.nextInt();
        
        System.out.println("10년동안 저축액 : " + deposit);
        
    }
}
