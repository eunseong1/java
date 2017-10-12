package java11.st3;


public class Boxtest {
    public static void main(String[] args) {
       int tmp;
       
      Box b = new Box();
      b.setWidth(100);
      b.setLength(100);
      b.setHeight(100);
       
      b.printVolumn();
      System.out.println(b.getVolumn());
        
    }
}
