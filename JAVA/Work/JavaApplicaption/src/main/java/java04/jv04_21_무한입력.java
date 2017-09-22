package java04;

import java.util.Scanner;

public class jv04_21_무한입력 {
    public static void main(String[] args) {
        
        for (int i = 0; true; i = i + 1) {
            
            Scanner key = new Scanner(System.in);
            System.out.print("정수를 입력하세요 : ");
            i = key.nextInt();
            
            System.out.println("입력한 값은 :" + i);
            if (i > 0) {
               
                
                
            }else{
                System.out.println("정상종료합니다.");
                break;
            }
        }
    }
}
