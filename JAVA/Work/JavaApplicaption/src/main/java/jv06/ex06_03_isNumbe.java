package jv06;

public class ex06_03_isNumbe {
    public static void main(String[] args) {
        
        String  s = "qwe";
        
        
        System.out.println(isNumber(s));
       
        
    }
    
    public static boolean isNumber(String s ) {
       
        boolean d = true;
       
        if(s.equals(null) || s.equals("qwe")){
           
            d = false;
        }else{
            d = true; 
        }
        
        return d;
        
    }
}
