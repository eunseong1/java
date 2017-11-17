package java07;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_05유효점수구하기 {
    public static void main(String[] args) {
        
        System.out.print("5명 심사위원의 점수 입력: ");
        
        int[] arr = { 7, 9, 4, 8, 5 };
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
        
        Arrays.sort(arr);
        System.out.println("유효점수: " + arr[1] + " " + arr[2] + " " + arr[3]);
        
        for (int j = 1; j <= arr.length - 2; j++) {
            sum = arr[j] + sum;
            
        }
        System.out.println("합계 :" + sum);
        
        System.out.print("평균: " + (double) sum / (arr.length - 2));
    }
}
