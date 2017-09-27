package java07;

public class jv07_01_배열의선언과생성 {
    
    public static void main(String[] args) {
        
        int[] numbers = new int[6];
        
        int size = 6;
        int[] numbers2 = new int[size];
        
        for (int j = 0; j < numbers.length; j = j + 1) {
            numbers[j] = j;
            System.out.println(numbers[j]);
        }
        
    }
    
}
