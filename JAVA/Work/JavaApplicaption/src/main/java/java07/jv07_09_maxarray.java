package java07;

import java.util.Arrays;


public class jv07_09_maxarray {
    public static void main(String[] args) {
        //배열 만들기
        int a = 6;
        int [] num = new int [a];
        //배열 값넣기
        num[0] = 3;
        num[1] = 1;
        num[2] = 7;
        num[3] = 6;
        num[4] = 9;
        num[5] = 3;
        //배열 정렬
        System.out.println("최대값은 : "+ num[num.length-1]);
        System.out.println("최소값은 : " + num[0]);
        
       int temp = max(num);
        System.out.println("최대값 " + temp);
        //최대값은 마지막방(배열명.length-1) 최소값을 배열 0번
        System.out.println("최대값은 : "+ num[num.length-1]);
        System.out.println("최소값은 : " + num[0]);
        
    }
  public static int max(int [] x) {
    
      
      //배열 정렬
      Arrays.sort(x);
      //최대값 반환
      return x[x.length-1];
      
      
      
      
      
    
}  
}

