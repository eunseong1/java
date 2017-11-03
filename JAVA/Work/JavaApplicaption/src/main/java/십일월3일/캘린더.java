package 십일월3일;

import java.util.Calendar;
import java.util.Date;

public class 캘린더 {
    public static void main(String[] args) {
      
        
        Date d = new Date();
        
        Calendar cal = Calendar.getInstance();
        
      
        cal.setTime(d);
        
      cal.add(Calendar.YEAR, 3);
      cal.add(Calendar.MONDAY, -4); 
      cal.add(Calendar.DATE, 2);
      
      System.out.println(cal.getTime());
      
      
      
      
    }
}
