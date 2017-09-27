package jv06;

import java.util.Scanner;

public class ex06_04_사칙연산 {
    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        
        Scanner put = new Scanner(System.in);
        System.out.print("First num: ");
        x = put.nextInt();
        System.out.print("Second num: ");
        y = put.nextInt();
        
        System.out.println(add(x,y));
        System.out.println(minus(x,y));
        System.out.println(mul(x,y));
        System.out.println(div(x,y));
    }
    
    public static int add(int a, int b) {
        
        int add = a + b;
        
        
        return add;
    }
    
    public static int minus(int a, int b) {
        
        int minus = a - b;
        
        
        return minus;
    }
    
    public static int mul(int a, int b) {
        
        int mul = a * b;
        
        return mul;
    }
    
    public static double div(int a, int b) {
        
        double div = (double) a / (double) b;
        
        return div;
    }
}
