package 십일월3일;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();   //arraylist 인스턴스 만들기
        
        System.out.println("심사위원수 입력");         //심사위원수 입력받기
        int x = s.nextInt();
                   //심사위원 점수 입력받기
        
           
        for (int i = 0; i <= x-1; i++) {    
            
            System.out.print("심사위원 점수 입력 ");                       //심사위원 점수입력 list 에 추가
            int a = s.nextInt();
            
            list.add(a);
            
        }
            //정렬
        Collections.sort(list);
        
        //합계 출력
        int sum = getsum(list);
        System.out.println("합계"  + sum);
        // 평균출력
        double avg = getavg(sum, list.size()-2);
        System.out.printf("평균"+"%.2f",avg);
    }
  //합계구하는 메서드
    public static int getsum (ArrayList<Integer> list){
        
        int sum = 0;
        System.out.print("유효점수 ");
        for (int i = 1; i <= list.size()-2; i++) {
           //1번방가져오기 list.get(1);
            System.out.print(list.get(i) +" "); // 유효점수구하는거
            sum = sum + list.get(i);
        }
        return sum;
        
        
    }
        //평균구하는 메서드
    public static double getavg(int sum, int size){
        
        return (double)sum /size;
        
    }
 
}
