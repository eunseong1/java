package jv06;


public class ex06_04_isNumber {
    public static void main(String [] args){
        
        String s = "d";//선언
        
        System.out.println(isNumber(s));//결과
        
    }
    
    public static boolean isNumber(String s) {
        
        boolean p = true; //상황시작
        
        if(s.equals(null) || s == "s" ){
            p = true;
        }else{                      //상황
            p = false;
        }

        return p; //상황끝
        
    }
}
