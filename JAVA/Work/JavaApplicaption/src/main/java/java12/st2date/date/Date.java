package java12.st2date.date;

public class Date {
    
    private int    year;
    private String month;
    private int    day;
    
    //
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public String getMonth() {
        return month;
    }
    
    public void setMonth(String month) {
        this.month = month;
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        this.day = day;
    }
    
    //
   
    
    public Date() {
        
    }

    //
    @Override
    public String toString() {
        return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
    }
    
}
