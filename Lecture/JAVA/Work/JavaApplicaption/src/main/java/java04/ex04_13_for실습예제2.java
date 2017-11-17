package java04;

public class ex04_13_for실습예제2 {
    public static void main(String[] agrs) {
        
        
            int sum = 0;
        for (int i = 1; i <= 9; i = i + 1) {
            sum = 2 * i;
            System.out.print("2*" + i + "=" + sum);
            
            if (i == 9){
                System.out.print(".");
            }
            else{
                System.out.print(", ");
            }
            
        }
      
    }
    
}
