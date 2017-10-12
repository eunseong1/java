package java12.st3car;

public class CatTest {
    
    public static void main(String[] args) {
        car myCar = new car();
        myCar.speedUp(100); // myCar.speed = 100
        myCar.speedPrint();
        System.out.println(myCar.toString());
        System.out.println("NumbersOfcars : " +myCar.getNumbersOfcars());
        
        car yourCar = new car();
        yourCar.setColor("blue");
        yourCar.setSpeed(60);
        yourCar.setGear(3);
        System.out.println(yourCar.toString());
        System.out.println("NumbersOfcars : " +myCar.getNumbersOfcars());
        
        car otherCar = new car("blue", 60 ,3);
        System.out.println(otherCar.toString());
        System.out.println("NumbersOfcars : " +myCar.getNumbersOfcars());
        
        
        System.out.println("-----------------");
        System.out.println("NumbersOfcars : " +myCar.getNumbersOfcars());
        System.out.println("NumbersOfcars : " +myCar.getNumbersOfcars());
        System.out.println("NumbersOfcars : " +myCar.getNumbersOfcars());
        
        System.out.println("-----------------");
        System.out.println(car.getNumbersOfcars());
        System.out.println(car.numbersOfcars);
        
    }
}
