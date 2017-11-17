package java12;

public class Rect {
    
    private int width;
    private int heigt;
    
    //
    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getHeigt() {
        return heigt;
    }
    
    public void setHeigt(int heigt) {
        this.heigt = heigt;
    }
    
    
    public Rect(){
        this(0,0);
    }
    //
    
   public Rect(int width, int heigt) {
        super();
        this.width = width;
        this.heigt = heigt;
    }

public int area() {
        return width * heigt;
    }
    
   public  int perimeter() {
        return 2 * (width + heigt);
    }
    
    //
    @Override
    public String toString() {
        return "Rect [width=" + width + ", heigt=" + heigt + "]";
    }
    
}
