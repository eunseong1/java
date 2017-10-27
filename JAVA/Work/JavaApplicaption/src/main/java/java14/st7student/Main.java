package java14.st7student;


public class Main {
  public static void main(String[] args) {
        
        
        
        Studenttest s = new Studenttest();
        
        
        s.phone ="ddd";
        s.name ="dddd";
        s.setNumber(10);
        s.lab="ddddd";
        
        System.out.println(s.toString());
        
        Studenttest s2 = new Studenttest();
        
        s2.setLab("aaaa");
        s2.setName("bbbb");
        s2.setNumber(1111);
        s2.setPhone("cccc");
        
        System.out.println(s2.toString());
        
        Studenttest s3 = new Studenttest(12938, "qwd", "Asfqewfwe", "Qwe");
        
        System.out.println(s3);
        
        
        
        
    }
}
