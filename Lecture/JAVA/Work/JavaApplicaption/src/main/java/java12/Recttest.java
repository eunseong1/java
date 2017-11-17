package java12;

import java.util.Scanner;

public class Recttest {
    public static void main(String[] args) {
    
        Rect r = new Rect();
        
        Scanner put = new Scanner(System.in);
        System.out.print("가로");
        r.setWidth(put.nextInt());
        System.out.print("세로");
        r.setHeigt(put.nextInt());
        
        System.out.println( "사각형의 넓이 : " +r.area());
        System.out.println( "사각형의 둘레 : "+r.perimeter());
    }
    
}
