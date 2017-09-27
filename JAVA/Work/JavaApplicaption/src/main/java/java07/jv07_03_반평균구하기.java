package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기 {
    public static void main(String[] args) {
    
        int [] s = new int[55];
        
        for(int i = 0; i  < s.length; i++ ){
            
            s[i] = i; 
            
            Scanner put = new Scanner(System.in);
            System.out.print("숫자를 입력하시오: ");
            i = put.nextInt();
            
        }
        System.out.println("배열의 값은 : "   );
        
        
    }
}
