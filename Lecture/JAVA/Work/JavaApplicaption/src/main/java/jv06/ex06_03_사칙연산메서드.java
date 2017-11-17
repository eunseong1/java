package jv06;

import java.util.Scanner;

public class ex06_03_사칙연산메서드 {
    public static void main(String[] args) {
        
        int x = 2, y =  4;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("First num :");
        x = keyboard.nextInt();
        System.out.print("Second num :");
        y = keyboard.nextInt();
        
        
        int add = Add(x, y);
        int minus = Minus(x, y);
        int mul = Mul(x, y);
        int div = Double(x, y);
    }
    
    private static int Mul(int x, int y) {
        
        int d = x * y;
        
        System.out.println(d);
        return 0;
        
    }
    
    private static int Double(int x, int y) {
        
        double c = x / (double)y;
        
        System.out.println(c);
        return 0;
        
    }
    
    private static int Minus(int x, int y) {
        
        int b = x - y;
        
        System.out.println(b);
        return 0;
        
    }
    
    private static int Add(int x, int y) {
        
        int a = x + y;
        
        System.out.println(a);
        return 0;
        
    }
}
