package 십일월1일2;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.print("학생수 ");
        int x = s.nextInt();
        int sss = 0;
        int ssss = 0;
        
        for (int i = 0; i <  x; i++) {
            System.out.print("성적을 입력하세요: ");
               int sc = s.nextInt();
               
               list.add(sc); // 추가   
        }
        list.set(1, 100); // 수정
        
        int ccc = list.size() - 1;
        
        list.remove(ccc); // 삭제와 arraylist 범위
         
        int llll = list.get(0); //방번호 찾기
       
        System.out.println(list.get(1));
       System.out.println(llll);
        System.out.println(sss);
        System.out.println(ssss);
    }
    
}
