package test1;

import java.util.Scanner;

public class 합구 {
    public static void main(String[] args) {
       
        Scanner p = new Scanner(System.in);
        
        System.out.print("시작");
        int x = p.nextInt();
        System.out.print("종료");
        int y = p.nextInt();
        
       add(x,y);
    }
    
    public static void add(int x, int y) {
        
        
        if (x > y) {
            int tmp = x;
           x = y;
           y = tmp;
        }
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum = sum + i;
            
        }
        System.out.println(x +"+ " +y+ "=" +sum);
        
    }

}
