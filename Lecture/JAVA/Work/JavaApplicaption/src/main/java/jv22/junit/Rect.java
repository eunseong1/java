package jv22.junit;


public class Rect {
 
    public int width = 0;
    public int height = 0;
    
    
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    
    public int area(){
       return this.width * this.height;
    }
    public int per(){
        return 2*(this.width + this.height);
     }
                                                    //this  여기안에있는 저걸씀
    
    
    public Rect(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }
    public Rect() {
        // TODO Auto-generated constructor stub
    }
    public Object type(){
        return null;
    }
    
}
