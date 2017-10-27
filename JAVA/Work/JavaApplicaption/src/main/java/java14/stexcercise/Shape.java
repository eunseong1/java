package java14.stexcercise;


public class Shape {
    
    private String color;
    private String point;
    //
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPoint() {
        return point;
    }
    public void setPoint(String point) {
        this.point = point;
    }
    //
    @Override
    public String toString() {
        return "Shape [color=" + color + ", point=" + point + "]";
    }
    //
    public Shape() {
        super();
    }
}
