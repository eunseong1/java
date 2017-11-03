package 십일월1일2;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

public class EmT {
    
    // 내일와서 사원수 입력하기
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        ArrayList<Em> list = new ArrayList<>();  
        System.out.print("사원수를 입력하세요");
         int x = s.nextInt();     
         Em e  =  new Em();
        for (int i = 0; i <= x-1; i++) {
          
            
            
            System.out.print("이름");
            e.setName(s.next());
            
            System.out.print("주소");
            e.setAddress(s.next());
            
            System.out.print("주민번호");
            e.setSalary(s.nextInt());
            
            System.out.print("월급");
            e.setRrn(s.next());
            
            list.add( e ); 
        }
        System.out.println();
        
        for (int i = 0; i <= x-1; i++) {
            
        
            
            System.out.println("이름은: " +e.getName() );
            System.out.println("주소는 : "+ e.getAddress());
            System.out.println("주민번호는 : "+ e.getSalary());
            System.out.println("월급은: "+ e.getRrn());
            System.out.println();
            list.add( e ); 
        }
        
    }
   
}
