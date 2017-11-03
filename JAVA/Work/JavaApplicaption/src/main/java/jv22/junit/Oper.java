package jv22.junit;


public class Oper {
    
    int x = 0;
    int z = 0;
    
  
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    
    @Override
    public String toString() {
        return "Oper [x=" + x + ", z=" + z + "]";
    }
    
    public Oper(int x, int z) {
        super();
        this.x = x;
        this.z = z;
    }
    
    public int add(){
        return this.x + this.z;
    }
    public int min(){
        return this.x - this.z;
    }
    public int mul(){
        return this.x * this.z;
    }
    public double div(){
        return (double)this.x + (double)this.z;
    }
    
}
