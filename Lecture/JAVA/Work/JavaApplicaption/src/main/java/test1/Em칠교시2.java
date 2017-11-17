package test1;

import java.util.Scanner;

public class Em칠교시2 {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        // 3개 짜리 배열
        Em칠교시[] 칠 = new Em칠교시[3];
        
       
        
        for (int i = 0; i <= 칠.length - 1; i++) {
            
            칠[i] = new Em칠교시(); // car 처럼 새로 생성
            
            System.out.print("이름");
            칠[i].setName(a.next());
            
            System.out.print("주소");
            칠[i].setAddress(a.next());
            
            System.out.print("주민번호");
            칠[i].setSalary(a.nextInt());
            
            System.out.print("월급");
            칠[i].setRrn(a.next());
            
        }
        System.out.println();
        
        for (int i = 0; i < 칠.length; i++) {
            
           System.out.println("이름 : "+ 칠[i].getName());
           System.out.println("주소 : "+ 칠[i].getAddress());
           System.out.println("주민번호 : " + 칠[i].getSalary());
           System.out.println("월급 : "+ 칠[i].getRrn());
           System.out.println();
            
        }
        
    }
    
}
