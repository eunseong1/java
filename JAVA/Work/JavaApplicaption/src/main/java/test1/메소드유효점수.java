package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 메소드유효점수 {
    public static void main(String[] args) {
        int a = 0;
        double b = 0;
        List<Integer> list = null;
                      list = new ArrayList<>();
                      
         list.add(5);            
         list.add(4);
         list.add(7);
         list.add(8);
         list.add(9);
                                             //정렬하고 포문으로 중간값구하기
      
         Collections.sort(list);
         
         for (int i = 1; i < list.size()-1; i++) {
            
             System.out.println( "유효점수" +list.get(i));
             a = a + list.get(i);
             b = (double)a / (list.size()-2);
             
        }
         System.out.println("합계" + a);
         System.out.printf("평균"+ "%.2f%n" , b);
    }
    
}
