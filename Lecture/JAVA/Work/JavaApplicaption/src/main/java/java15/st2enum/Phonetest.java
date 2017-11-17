package java15.st2enum;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.Scanner;

public class Phonetest {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.println("입력하세요");
        String p = a.nextLine();
        
        String header = p.substring(0, 3);
        
        System.out.println(header);
        
        Phone ph = new Phone();
        
        if (ph.P010.equals(header)) {
            System.out.println("general");
        }
        else if (ph.P011.equals(header)) {
            System.out.println("sk");
        }
        else if (ph.P016.equals(header)) {
            System.out.println("kt");
        }
        else if (ph.P019.equals(header)) {
            System.out.println("lg");
        }
        ////////////// ENUM /////////////////////////
        if (header.equals(PhoneEnum.P010.getValue())) {
            System.out.println("general");
        }
        else if (header.equals(PhoneEnum.P011.getValue())) {
            System.out.println("sk");
        }
        else if (header.equals(PhoneEnum.P016.getValue())) {
            System.out.println("kt");
        }
        else if (header.equals(PhoneEnum.P019.getValue())) {
            System.out.println("lg");
        }
        
    }
}
