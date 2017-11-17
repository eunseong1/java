package 십일월1일;

import java.util.Scanner;

import java17.st2product.Product;

public class ProTest {
    static Scanner k = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Scanner p = new Scanner(System.in);
       
        Pro[] a = new Pro[10];
        int roomnumber = 0;
        
        for (; true;) {
            
            System.out.println("상품추가<1>, 모든 상품 조회<2>, 끝내기<3>");
            int f = k.nextInt();
            if (f == 1) {
                
                System.out.print("상품종류  책<1>, 음악CD<2>, 회화책<3>");
                int o = p.nextInt();
                if (o == 1) {
                    
                    Bo b = new Bo();
                    
                    System.out.println("ISBN번호");
                    b.setISBN번호(p.next());
                    
                    System.out.println("가격정보");
                    b.set가격정보(p.nextInt());
                    
                    System.out.println("상품설명");
                    b.set상품설명(p.next());
                    
                    System.out.println("생산자");
                    b.set생산자(p.next());
                    
                    System.out.println("식별자");
                    b.set식별자(p.next());
                    
                    System.out.println("저자");
                    b.set저자(p.next());
                    
                    System.out.println("책제목정보");
                    b.set책제목정보(p.next());
                    
                    a[roomnumber] = b;
                    roomnumber++;
                    
                } else if (o == 2) {
                    
                    Com c = new Com();
                    
                    System.out.println("가수이름");
                    c.set가수이름(p.next());
                    
                    System.out.println("가격정보");
                    c.set가격정보(p.nextInt());
                    
                    System.out.println("상품설명");
                    c.set상품설명(p.next());
                    
                    System.out.println("생산자");
                    c.set생산자(p.next());
                    
                    System.out.println("식별자");
                    c.set식별자(p.next());
                    
                    System.out.println("앨범제목");
                    c.set앨범제목(p.next());
                    
                    a[roomnumber] = c;
                    roomnumber++;
                    
                } else if (o == 3) {
                    
                    Conver v = new Conver();
                    
                    System.out.println("ISBN번호");
                    v.setISBN번호(p.next());
                    
                    System.out.println("가격정보");
                    v.set가격정보(p.nextInt());
                    
                    System.out.println("상품설명");
                    v.set상품설명(p.next());
                    
                    System.out.println("생산자");
                    v.set생산자(p.next());
                    
                    System.out.println("식별자");
                    v.set식별자(p.next());
                    
                    System.out.println("저자");
                    v.set저자(p.next());
                    
                    System.out.println("책제목정보");
                    v.set책제목정보(p.next());
                    
                    System.out.println("회화책");
                    v.set회화책(p.next());
                    
                    a[roomnumber] = v;
                    roomnumber++;
                    
                } else {
                    System.out.println("잘못입력");
                }
            } else if (f == 2) {
 
                
                System.out.println("입력하세요" );
                int x = p.nextInt();
                System.out.println(a[x].toString());
                
            } else if (f == 3) {
                
                break;
                
            } else {
                System.out.println("잘못된입력");
            }
            
        }
        
    }
    
}
