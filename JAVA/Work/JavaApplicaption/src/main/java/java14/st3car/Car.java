package java14.st3car;


public class Car {
    //필드
    private int speed;
    private int gear;
    private String color;
    
    
    // gettet setter
    
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getGear() {
        return gear;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
  //toString
    @Override
    public String toString() {
        return "Car [speed=" + speed + ", gear=" + gear + ", color=" + color
                + "]";
    }
    
    //constructor 생성자
    public Car() {
        super();
    }
    
    public Car(String color) {
        super();
        this.color = color;
    }
//constructor 
   public Car(int speed, int gear, String color) {
        super();
        this.speed = speed;
        this.gear = gear;
        this.color = color;
    }
    //메서드
    public void speedup(int s ){
        this.speed = this.speed + s;
    }
    public void speeddown(int s){
        this.speed = this.speed - s;
    }
    
}
