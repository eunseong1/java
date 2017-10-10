package java07;

import java.util.Arrays;

public class ex07_03_배열로최대최소구하기 {
    public static void main(String[] args) {
        
        System.out.print("배열 정렬 전 :");
        int[] arr = { 1, 3, 4, 5, 7, 6, 56, 34, 54, 23 };
        
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]);//배열 값넣기
            if (i == arr.length - 1) {
                System.out.println(".");
            } else {
                System.out.print(",");
            }
        }
        System.out.print("배열 정렬 후 :");
        for (int i = 0; i <= arr.length-1; i++) {
            Arrays.sort(arr);
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.println(".");
            } else {
                System.out.print(",");
            }
            
        }
        System.out.println("최소값: " + arr[0]);//정렬되서 최소값은 첫째
        System.out.print("최대값: " + arr[arr.length - 1]);
    }
    
}
