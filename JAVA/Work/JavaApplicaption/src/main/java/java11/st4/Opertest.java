package java11.st4;

import java.util.Scanner;

public class Opertest {
    public static void main(String[] args) {
     
        
        Oper o = new Oper();
     

        Scanner put = new Scanner(System.in);
        System.out.print("First num ");
        o.setA(put.nextInt());
        System.out.print("Second num ");
        o.setB(put.nextInt());
        
        // o.매서드이름 ;
        
        System.out.println(o.i());
        System.out.println(o.u());
        System.out.println(o.y());
        System.out.println(o.t());
    }
    
}
