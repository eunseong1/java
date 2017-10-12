package java11.st2;

public class car {
    
    // 필드
    private String color = "빨강";
    private int    speed = 100;
    private int    gear  = 4;
    
    // 동작: 메서드
    void speedUp(int s) {
        this.speed = speed+ s; //speed += s;
    }
    
    void speeddown(int s) {
        speed = speed - s; //speed -= s;
    }
    public void speedPrint(){
        System.out.println("속도" + speed + "km");
    }

    //getter & setter
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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
    
    //constructor(생성자)
    
    public car() {
        super();
    }

    public car(String color, int speed, int gear) {
        super();
        this.color = color;
        this.speed = speed;
        this.gear = gear;
    }

    
    //toString()
    @Override
    public String toString() {
        return "car [color=" + color + ", speed=" + speed + ", gear=" + gear
                + "]";
    }
    

    
}