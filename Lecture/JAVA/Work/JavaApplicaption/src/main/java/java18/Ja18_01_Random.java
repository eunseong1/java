package java18;

import java.util.Random;
import java.util.Scanner;

public class Ja18_01_Random {
    public static void main(String[] args) {
        
        Random r = new Random();
        double rand1 = r.nextDouble();
        
        System.out.println(rand1);
        
        double rand3 = r.nextDouble() * 2;
        System.out.println(rand3);
        
        double rand4 = new Random().nextDouble() * 2 + 1;
        
        System.out.println(rand4);
        
        for (int i = 1; i <= 5; i++) {
            
            double rand5 = new Random().nextDouble() * 10;
            System.out.println(rand5);
            
        }
        
        Scanner put = new Scanner(System.in);
        System.out.print("최대값 입력 ");
        int a = put.nextInt();
        System.out.print("최소값 입력 ");
        int b = put.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int rand6 = r.nextInt(a - b + 1) + b;
            System.out.println(rand6);
            
        }
        
    }
}
