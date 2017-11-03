package 십일월1일2;

public class PhoneInfo {
    
    private String name     = "";
    private String phone    = "";
    private String birthday = "";
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getBirthday() {
        return birthday;
    }
    
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    


    @Override
    public String toString() {
        return "PhoneInfo [name=" + name + ", phone=" + phone + ", birthday="
                + birthday + ", toString()=" + super.toString() + "]";
    }

    public PhoneInfo() {
        super();
    }

    public PhoneInfo(String name, String phone, String birthday) {
        super();
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
    }

   
}
