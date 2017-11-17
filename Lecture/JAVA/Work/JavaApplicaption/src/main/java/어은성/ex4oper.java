package 어은성;

public class ex4oper {
    
    private int f = 0;
    private int s = 0;
    
    public int getF() {
        return f;
    } 
    public void setF(int f) {
        this.f = f;
    }
    public int getS() {
        return s;
    }
    public void setS(int s) {
        this.s = s;
    }
    @Override
    public String toString() {
        return "ex4oper [f=" + f + ", s=" + s + "]";
    }
    
    public ex4oper(int f, int s) {
        super();
        this.f = f;
        this.s = s;
    }
    public ex4oper() {
        super();
    }
    public int min(int f, int s) {
        return f - s;
    }
    public int mul(int f, int s) {
        return f * s;
    }
    public double div(int f, int s) {
        return (double) f / s;
    }
    public int add(int f, int s) {
        return f + s;
    }
    
}
