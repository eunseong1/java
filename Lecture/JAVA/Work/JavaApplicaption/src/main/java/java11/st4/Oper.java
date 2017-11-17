package java11.st4;





public class Oper {
    
    private int a;
    private int b;
  
    
    
    //getter setter
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    
    //constructor(생성자)
   
   public int i(){
       return a+b;
   }
   public int u(){
       return a-b;
   }
   public int y(){
       return a*b;
   }
   public double t(){
       return (double)a/b;
   }
  
    
}
