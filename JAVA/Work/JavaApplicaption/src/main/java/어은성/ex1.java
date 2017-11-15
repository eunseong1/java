package 어은성;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("시작값을 입력하세요");
        int x = s.nextInt();
        System.out.print("종료값을 입력하세요");
        int y = s.nextInt();
        
        int su = 0;
        
        if (x > y) {
            int t = x;
            x = y;
            y = t;
            
        }
        
        su = add(x, y, su);
        System.out.println(" = " + su);
    }
    
    public static int add(int x, int y, int su) {
        for (int i = x; i <= y; i++) {
            System.out.print(i);
            if (i == y) {
                
            } else {
                System.out.print(" + ");
            }
            
            su = su + i;
        }
        return su;
    }
}
