package test1;

import java.util.Scanner;

public class 오교시test {
    public static void main(String[] args) {
       
        Scanner p = new Scanner(System.in);
        System.out.print(" 첫번째 숫자");
        int x = p.nextInt();
        System.out.println("두번째 숫자");
        int y = p.nextInt();
        
        
       오교시1 ㅁ = new 오교시1();
       
       System.out.println(ㅁ.add(x, y));
       System.out.println(ㅁ.avg(x, y));
       System.out.println(ㅁ.min(x, y));
       System.out.println(ㅁ.mul(x, y));
        
       
    }

    
    
}
