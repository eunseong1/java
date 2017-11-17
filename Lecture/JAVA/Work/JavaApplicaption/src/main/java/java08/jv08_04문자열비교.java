package java08;

import java.util.Scanner;

public class jv08_04문자열비교 {
    public static void main(String[] args) {
        
        
        Scanner put = new Scanner(System.in);
        System.out.print("Please input first string");
        String i = put.nextLine();
        System.out.print("please input second string");
        String y = put.nextLine();
        
        
        if(i.equals(y)){
            System.out.println("i.equals(y) : same");
        }else{
            System.out.println("i.equals(y) : not same");
        }
        //== 을통해 비교
        if(i==y){
            System.out.println("i.equals(y) : same");
        }else{
            System.out.println("i.equals(y) : not same");
        }
        
        
    }
    
    
    
    
    
    
    
}
