package 어은성;

import java.util.Scanner;

public class ex5Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Ma m[] = new Ma[3];
        
        for (int i = 0; i < m.length; i++) {
            
            m[i] = new Ma();
            
            System.out.print("이름 : ");
            m[i].setName(s.next());
            System.out.print("주소 : ");
            m[i].setAddr(s.next());
            System.out.print("월급 : ");
            m[i].setSalary(s.nextInt());
            System.out.print("주민번호 : ");
            m[i].setRrn(s.next());
            System.out.print("보너스 :");
            m[i].setBonus(s.nextInt());
        }
        System.out.println();
        
        for (int j = 0; j < m.length; j++) {
            
            System.out.println("이름 : " + m[j].getName());
            System.out.println("주소 : " + m[j].getAddr());
            System.out.println("월급 : " + m[j].getSalary());
            System.out.println("주민번호 : " + m[j].getRrn());
            System.out.println("보너스 : " + m[j].getBonus());
            
        }
        System.out.println();
    }
}
