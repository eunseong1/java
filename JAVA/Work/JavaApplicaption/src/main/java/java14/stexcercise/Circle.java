package java14.stexcercise;


public class Circle extends Shape{
    
    private int radius;

    
    //
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
//
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
//
    public Circle() {
        super();
    }
    
  
    
}