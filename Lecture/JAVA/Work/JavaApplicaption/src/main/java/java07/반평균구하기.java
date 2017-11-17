package java07;

import java.util.Scanner;

public class 반평균구하기 {
    public static void main(String[] args) {       
        
        Scanner put = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int s  = put.nextInt();
        int[] arr = new int[s];
        
        for (int i = 0; i <= arr.length -1; i++) {
            
            Scanner put1 = new Scanner(System.in);
            System.out.print("숫자를 입력하시오: ");
            arr[i] = put1.nextInt();
        }
        System.out.print("배열의 값 : ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]);
            
            if (i == arr.length - 1) {
                
            } else {
                System.out.print(",");
            }
        }
    }
}
