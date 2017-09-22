package java01;

import java.util.Scanner;

public class java03_01LargeSmall {
    public static void main(String[] args) {
        
        int n  = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("값을 입력하세요: ");
        n = keyboard.nextInt();
        
        if(n >= 100){
            System.out.println("large");
        }else{
            System.out.println("small");
        }
        
    }
}
