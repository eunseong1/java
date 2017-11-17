package java04;

import java.util.Scanner;

public class ex04_14구구단 {
    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작 단수를 입력하세요 : ");
        x = keyboard.nextInt();
        System.out.print("종료 단수 입력하세요 : ");
        y = keyboard.nextInt();
        
       
               
            if (x < y) {
                for (int i = x; i <= y; i = i + 1) {
                    for (int j = 1; j <= 9; j = j + 1) {
                        int r = i * j;
                        System.out.println(i + " * " + j + " = " + r + ", ");
                    }
                }
            }
            
            if(x > y){
                for (int i = y; i <= x; i = i + 1) {
                    for (int j = 1; j <= 9; j = j + 1) {
                        int r = i * j;
                     System.out.println(i + " * " + j + " = " + r + ", ");
                        break;
                    } 
                    } 
                    }            
            else {
                        
                        System.out.println("종료합니다");
                     
            }
    }
}
                
    
