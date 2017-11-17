package test1;

import java.util.Scanner;

public class Matest {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Ma e  [] = new Ma[3];
      
        
        for (int i = 0; i < e.length; i++) {
            
            e[i] = new Ma();
            
            System.out.print("이름");
            e[i].setName(s.next());
            
            System.out.print("주소");
            e[i].setAddress(s.next());
            
            System.out.print("주민번호");
            e[i].setSalary(s.nextInt());
            
            System.out.print("월급");
            e[i].setRrn(s.next());
            
            System.out.print("보너스");
            e[i].setBouns(s.nextInt());
           System.out.println();
        }
        
        for (int j = 0; j < e.length; j++) {
            
            System.out.println("이름"+e[j].getName());
            System.out.println("주소"+e[j].getAddress());
            System.out.println("주민번호"+e[j].getSalary());
            System.out.println("월급"+e[j].getRrn());
            System.out.println("이름"+e[j].getBouns());
            System.out.println();
        }
    }
}
