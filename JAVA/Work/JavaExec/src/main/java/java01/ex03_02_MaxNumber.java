package java01;

public class ex03_02_MaxNumber {
    public static void main(String[] agrs) {
        
        int x = 1;
        int y = 2;
        int z = 3;
        
        if (x < y) {
            System.out.println(y);
            if (y < z) {
                System.out.println(z);
            }
        }else{
            if(z > x){
                System.out.println(z);
            }
        }
    }
}
