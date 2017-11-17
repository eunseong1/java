package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 팔교시 {
    
    public static void main(String[] args) {
        
        Scanner p = new Scanner(System.in);
        System.out.print("학생수를 입력하세요");
        int x = p.nextInt();
        int z = 0;
        int a = 0;
        
       List<Integer> arr = null;
                     arr = new ArrayList<Integer>();
        
        for (int i = 0; i <= x - 1; i++) {
            System.out.print("점수를 입력하세요");
            arr.add(p.nextInt());
            
            z = z + arr.get(i)   ;
            
            a = z / x;
            
        }
        System.out.println("합계" + z);
        System.out.println("평균" + a);
    }
    
}
