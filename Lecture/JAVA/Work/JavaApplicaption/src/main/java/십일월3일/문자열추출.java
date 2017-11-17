package 십일월3일;

import java.util.Scanner;

public class 문자열추출 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("입력하세요");
        String input = s.next();
        char c = input.charAt(0);
        
        if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
            System.out.println("영문자입니다");
        } else if (('!' <= c && c <= '/') || (':' <= c && c <= '@')
                || ('[' <= c && c <= '`')) {
            System.out.println("기호입니다");
        } else {
            System.out.println("숫자입니다");
        }
        
    }
}
