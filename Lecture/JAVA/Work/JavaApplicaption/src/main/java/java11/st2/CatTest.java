package java11.st2;

public class CatTest {
    
    public static void main(String[] args) {
        car myCar = new car();
        myCar.speedUp(100); // myCar.speed = 100
        myCar.speedPrint();
        System.out.println(myCar.toString());
        
        
        car yourCar = new car();
        yourCar.setColor("blue");
        yourCar.setSpeed(60);
        yourCar.setGear(3);
        System.out.println(yourCar.toString());
        
    }
}
