package test1;

import java.awt.geom.Area;
import java.util.Scanner;

public class 육교시test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("가로의값 ");
        int w = s.nextInt();
        System.out.print("세로의값 ");
        int h = s.nextInt();
        
        육교시 ㅇ = new 육교시();
        
        System.out.println("사각형의 넓이 " + ㅇ.area(w, h));
        System.out.println("사각형의 둘레 " + ㅇ.perimeter(w, h));
    }
}
