package java15.st4anonymous;


public class AnonymousTest {
    
    public static void main(String[] args) {
        
        //클래스를 이용한 인스턴스 생성
        
        TV tv1 = new TV();
        
        // 인터페이스에 인스턴스 저장
        RemoteContol tv2 = new TV();
        
        //무명 클래스를 이용한 인스턴스 생성
        RemoteContol tv3 = new  RemoteContol() {
            
            @Override
            public void turnOff() {
            }
            
            @Override
            public void turnON() {
            }
            
            @Override
            public void moveRight() {
            }
            
            @Override
            public void moveLeft() {
            }
        };
    }
    
}
