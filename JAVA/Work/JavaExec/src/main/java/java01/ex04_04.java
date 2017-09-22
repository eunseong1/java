package java01;

import java.util.Scanner;

public class ex04_04 {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        int s = 0;
        Scanner keyboard =new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        x = keyboard.nextInt();
        System.out.print("정수를 입력하세요 : ");
        y = keyboard.nextInt();
        for (int i = x; i <= y; i = i + 1) {
            s = s + i;
            
        }
        System.out.println("1부터" + y + "까지의 합계는" + s +"입니다");
    }
    
}
