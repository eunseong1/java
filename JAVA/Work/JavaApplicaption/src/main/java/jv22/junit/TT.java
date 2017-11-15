package jv22.junit;


public class TT {
    
    
    private int x = 0;
    private int y = 0;
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    
    @Override
    public String toString() {
        return "TT [x=" + x + ", y=" + y + "]";
    }
    
    
    public TT(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    
    
    public TT() {
        super();
        
        
    }
    
    public int add (){
        return x + y;
    }
    public int Min (){
        return x - y;
    }
    public int Mul (){
        return x * y;
    }
    public double Div (){
        return (double)x / y;
    }
    
    
}
