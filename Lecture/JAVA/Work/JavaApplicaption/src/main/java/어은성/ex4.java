package 어은성;

import java.util.Scanner;

public class ex4 {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("frist num : ");
        int f = p.nextInt();
        System.out.print("Second num : ");
        int s = p.nextInt();
        
        ex4oper e = new ex4oper();
        
        System.out.println(e.add(f,s));
        System.out.println(e.min(f,s));
        System.out.println(e.mul(f,s));
        System.out.println(e.div(f,s));
    }
}
