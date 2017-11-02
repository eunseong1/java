package 십일월1일;

import java.util.Scanner;

import java17.st2product.Product;

public class ProTest {
    static Scanner k = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Scanner p = new Scanner(System.in);
        
        Pro[] a = new Pro[10];
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("a" + a.toString());
        }
        
        for (; true;) {
            
            System.out.println("상품추가<1>, 모든 상품 조회<2>, 끝내기<3>");
            int f = k.nextInt();
            if (f == 1) {
              //  상품입력(p);
            } else if (f == 2) {
               // 상품출력(p);
            } else if (f == 3) {
                break;
            } else {
                System.out.println("잘못된입력");
            }
            
        }
        
    }
            //배열안에 있는 정보를 출력
    private static void 상품출력(Pro[] p) {
        for (int i = 0; i <= p.length - 1; i++) {
            System.out.println("p" + p.toString());
        }    
    }
                                       // 상품추가 조건문만들고                      
    private static void 상품입력(Pro [] p){
                            
        if
        
        
    }
}
