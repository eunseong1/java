package java03;

import java.util.Scanner;

public class ex03_02_MaxNumber {
    public static void main(String[] args) {
        
        int x = 0;
        
        Scanner keyboard1 = new Scanner(System.in);
        System.out.print("x를 입력하세요");
        x = keyboard1.nextInt();
        
        int y = 0;
        
        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("y를 입력하세요");
        y = keyboard2.nextInt();
       
        int z =  0;
        
        Scanner keyboard3 = new Scanner(System.in);
        System.out.print("z를 입력하세요");
        y = keyboard3.nextInt();
        
       
        if (x > y) {
            System.out.println("x의 값은 : "+ x);
        } if (x < y) {
            System.out.println("y의 값은 :  " + y);
        } else {
           System.out.println("");
        }
      
        }
    }

