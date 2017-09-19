package java04;


public class ex01_11_for실습예제 {
    public static void main(String[] args){
        
        int sum = 0;
        for(int i =2; i<=10; i=i+1 )
        {
            sum = sum + i;
            System.out.println("1부터 "+ sum +" 까지의 합 : "+sum);
        }
        
    }
}
