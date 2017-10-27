package java15.st1inner;

public class OuterClass {
    
    private String secret = "time";
    
    public OuterClass() {
        InnerClass obj = new InnerClass();
        obj.print();
        
    }
    
    private class InnerClass {
        
        public InnerClass() {
            System.out.println("내부");
        }
        
        public void print() {
            System.out.println(secret);
        }
    }
}
