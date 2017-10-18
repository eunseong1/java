package java14.st4shape;


public class Rectangle extends Shape {
    
    //필드
    private int width = 0;
    private int heigth = 0;
    
    //getter setter
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeigth() {
        return heigth;
    }
    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
 
    // toString
    
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", heigth=" + heigth + "]";
    }
    
    
    //constructor
    public Rectangle() {
        super();
        System.out.println("Rectangle");
    }
   
    public Rectangle(int x, int y, String color) {
        super(x, y, color);
        System.out.println("int x, int y, String color Rectangle");
        
    }
    //width, heigth 매개변수로 넘겨받는 생성자를 만드시오
    public Rectangle(int width, int heigth) {
        super();
        System.out.println("int width, int heigth Rectangle");
        this.width = width;
        this.heigth = heigth;
    }
    // x ,y ,color,width ,heigth 를 매개변수로 넘겨받는 생성자를 만드시오
    public Rectangle(int x, int y, String color, int width, int heigth) {
        super(x, y, color);
        System.out.println("int x, int y, String color, int width, int heigth Rectangle");
        this.width = width;
        this.heigth = heigth;
    }
    
    
}

