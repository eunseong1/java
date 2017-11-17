package java17.st1shape;

public class Rectangle extends Shape {
    
    public int widht;
    public int height;
    
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
   
    //
    public Rectangle() {
        super();
    }
    
  

  
    @Override
    public String toString() {
        return "Rectangle [widht=" + widht + ", height=" + height + ", color="
                + color + ", x=" + x + ", y=" + y + "]";
    }

    @Override
    public Shape getShape() {
        
        return null;
    }
    
    public void draw() {

        System.out.println("Rectangle draw");
    }
    
}
