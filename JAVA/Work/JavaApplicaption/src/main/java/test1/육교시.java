package test1;

import java.util.Scanner;

public class 육교시 {

      private  int width = 0;
      private  int height = 0;
        
    
 //
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
    
    //   @Override
    public String toString() {
        return "육교시 [width=" + width + ", height=" + height + "]";
    }
    
    
    public 육교시() {
        super();
    }
    
    public   int area(int a, int b){
        return  a * b;
    }
 
    public int perimeter(int a , int b){
        return 2*(a+b);
        
    }
    
}
