package java04;

public class jv04_12_구구단가로출력 {
    public static void main(String[] args) {
        
        int r = 0;
        
        for (int i = 2; i <= 19; i = i + 1) {
            for (int j = 1; j <= 9; j = j + 1) {
                r = i + j;
                if (j == 9) {
                    System.out.print(i + " * " + j + " = " + r+" " + " \n ");
                } else {
                    System.out.print(i + " * " + j + " = " + r+" ");
                }
            }
        }
        
    }
}
