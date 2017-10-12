package java07;



import java.util.Arrays;
import java.util.Scanner;

public class jv07_08array메서드 {
    public static void main(String[] args) {
    
        Scanner put = new Scanner(System.in);
    
        //배열 만들기
        int s = 6;
        int [] num = new int[s];
        //for문을 이용한 배열 초기화
        for (int i = 0; i <= num.length-1; i++) {
            num[i] = num.length-i ;
        }
        printarray(num);
        //array 정렬 printArray()호출
       Arrays.sort(num);
        printarray(num);
        //arrays 검색 printArray()호출
        int val = java.util.Arrays.binarySearch(num, 4);
        System.out.println("4값의 위치"+ val);
        //arrays 초기화 printArray()호출
       Arrays.fill(num, -1);
       printarray(num);
    }
    public static void printarray(int[] a) {
        
    
        for (int i = 0; i <= a.length -1; i++) {
           System.out.print(a[i]+ ",");
             
        }
    //메서드 만들기
        
    //메서드명 :printArray
    //메서드 타입:void
    //매개변수 : 정수배열
        return;
    }
}
