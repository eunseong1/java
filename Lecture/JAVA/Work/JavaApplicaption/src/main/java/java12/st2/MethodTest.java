package java12.st2;

public class MethodTest {
    public static void main(String[] args) {
        
        Method m = new Method();
        
        //인스턴스 메서드를 호출할떄는 인스턴스 이름. 메서드명
        m.instanceMethod();
        
        m.staticMethod(); // 이방법은 사용 xx
        // static 메서드를 호출할 때는 클래스 이름 .메서드명
        Method.staticMethod();
    }
    
}
