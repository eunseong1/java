package java14.stexcercise;


public class Rectangle extends Shape{
    
    private int widht = 0;
    private int height = 0;
    //
    public int getWidht() {
        return widht;
    }
    public void setWidht(int widht) {
        this.widht = widht;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    //
    @Override
    public String toString() {
        return "Rectangle [widht=" + widht + ", height=" + height + "]";
    }
    //
    public Rectangle() {
        super();
        System.out.println();
    }
    
}
