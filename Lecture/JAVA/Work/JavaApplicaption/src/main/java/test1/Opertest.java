package test1;

import java.util.Scanner;

public class Opertest {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("첫번째 수");
        int x = p.nextInt();
        System.out.print("두번째 수 ");
        int y = p.nextInt();
       
        Oper oper = new Oper();
        
       System.out.println(oper.add(x, y)); 
       System.out.println(oper.div(x, y)); 
       System.out.println(oper.min(x, y)); 
        System.out.println(oper.mul(x, y));
    }
    
}
