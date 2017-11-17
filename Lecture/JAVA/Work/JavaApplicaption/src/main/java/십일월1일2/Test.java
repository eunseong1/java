package 십일월1일2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        ArrayList<Integer> pp = new ArrayList<>();
        
        for (; true;) {
            
            PhoneInfo p = new PhoneInfo();
            
            System.out.println("선택하세요");
            System.out.println("1.데이터입력");
            System.out.println("2.데이터 검색");
            System.out.println("3.데이터 삭제");
            System.out.println("4.프로그램 종료");
            int x = s.nextInt();
            
            if (x == 1) {
                System.out.print("이름");
                p.setName(s.next());
                
                System.out.print("전화번호");
                p.setPhone(s.next());
                
                System.out.print("생년월일");
                p.setBirthday(s.next());
                
            } else if (x == 2) {
                
                System.out.println("데이터 검색을 시작합니다"); 
                s.next();
                System.out.println("name: " + p.getName());
                System.out.println("phone: " + p.getPhone());
                System.out.println("birth: " + p.getBirthday());
                
            }else if (x == 3){
                
                pp.remove(x);
                System.out.println("데이터 삭제를 시작합니다");
                s.next();
                System.out.println("데이터 삭제가 완료되었습니다");
            }
            
        }
        
    }
    
}
