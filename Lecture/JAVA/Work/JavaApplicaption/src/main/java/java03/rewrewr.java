package java03;

import java.util.Scanner;

public class rewrewr {
    public static void main(String[] args) {
        
        int k = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("값을 입력하세요");
        k = keyboard.nextInt();
        
        if(k == 0){
           System.out.println("A");
        }if (k >= 3){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }
}
