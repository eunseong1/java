package java14.st3car;

public class ScarTest {
    public static void main(String[] args) {
        
        Scar ts1 = new Scar();
        ts1.setColor("white");
        ts1.setGear(6);
        ts1.setSpeed(250);
        ts1.setTurbo(true);
        
        Scar ts2 = new Scar(300,5,"green", true);
        
        
        Scar ts3 = new Scar(true);
        
        //매개변수 color, turbo 생성자 만들기
        Scar ts4 = new Scar("black", true);
        
        
        System.out.println(ts1.toString());
        System.out.println(ts2.toString());
        System.out.println(ts3.toString());
        System.out.println(ts4.toString());
        
    }
}
