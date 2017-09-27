package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기3 {
    public static void main(String[] args) {
        
        Scanner put = new Scanner(System.in);
        System.out.print("학생수를 입력 하시오 : ");
        int s = put.nextInt();
        int[] arr = new int[s];
        int sum = 0;
        int dou = 0;
        
        for (int i = 0; i <= arr.length -1; i++) {
            
            Scanner put1 = new Scanner(System.in);
            System.out.print("성적을 입력하시오 : ");
            arr[i] = put1.nextInt();
            
            sum =  sum + arr[i];
            dou = sum / arr.length;
        }
        for (int i = 0; i <= arr.length -1; i++) {
            System.out.print(arr[i]);
            
            if (i == arr.length -1) {
                System.out.print(" ");
            } else {
                System.out.print(",");
            }
        }
        System.out.println("합계는 : " + sum);
        System.out.println("평균은 : " + dou);
    }
}
