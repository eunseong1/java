package java17.st2product;

import java.util.Scanner;

public class ProductTest {
   static Scanner keyboard = new Scanner(System.in);
private static int roomid;
    public static void main(String[] args) {
        
        Product[] p = new Product[10];
        
        
        
       
        
        //출력
        for (int i = 0; i <= p.length-1; i++) {
            System.out.println("p"+p.toString());
            // i==0 --> book.toString()
         // i==1 --> compatDisc.toString()
         // i==2 --> ConversationBook.toString()
   }
        
      
      for(; true ;){
          
          System.out.print("상품 추가(1), 모든 상품 조회(2),종류(3) >>");
          int menu = keyboard.nextInt();
          
          if(menu == 1){// 상품입력
              상품입력(p);
          }else if(menu ==2){// 상품출력
              상품출력(p);
          }else if (menu ==3){
              break;
          }else{
              System.out.println("잘못된 입력");
          }
          
      }
       
    }
//상품종류 입력받아 배열에 저장하는 코드 출력
    private static void 상품출력(Product[] p) {
        for (int i = 0; i <= p.length-1; i++) {
            System.out.println("p"+p.toString());
   }
    }

    private static void 상품입력(Product[] p) {
        System.out.print("책(1), 음악(2),회화(3) >>");
        int menu = keyboard.nextInt();
        
        if(menu ==1){

                
            p[roomid] = new Book();
            roomid = roomid +1;
        }else if (menu ==2){
            
            p[roomid] = new CompatDisc();
            System.out.println("상품 설명");
            keyboard.next();
            roomid = roomid +1;
        }else if (menu ==3){
            
            p[roomid] = new CoversationBook();
            roomid = roomid +1;
        }
        

   
        
    }
}
