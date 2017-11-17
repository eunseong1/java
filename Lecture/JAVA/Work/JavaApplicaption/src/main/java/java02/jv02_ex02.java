package java02;

import java.util.Scanner;

public class jv02_ex02 {
	public static void main(String[] args) {

		int w = 50;
		int h = 30;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		w = keyboard.nextInt();
		h = keyboard.nextInt();
		
		
		
		
		int a = w * h;
		int p = 2 * (w + h);

		System.out.println("사각형의 넓이 : " + a);
		System.out.println("사각형의 둘레 : " + p);
	}
}
