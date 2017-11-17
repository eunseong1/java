package java13;


public class Test {
    public void sub(int... v){
        System.out.println("인수의 개수:" + v.length);
        
        for(int x : v){
            System.out.println(x + "  ");
        }
        System.out.println();
        
        
        System.out.println("--------------------");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]+ "");
            
            
        }
        System.out.println();
        System.out.println("***********************");
    }
    
    
    
}
