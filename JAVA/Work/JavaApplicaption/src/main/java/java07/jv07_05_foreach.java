package java07;

public class jv07_05_foreach {
    public static void main(String[] args) {
        
        int [] numbers = {10,20,30};
        
        for (int j = 0; j <= numbers.length -1; j++) {
            System.out.println(numbers[j]);
        }
     for(int value : numbers){
         System.out.print(value);
     }
    }
}