package 십일월1일;


public class Pro {
    
    private String 식별자 = "";
    private String 상품설명 = "";
    private String 생산자 = "";
    private int 가격정보 = 0;
    
    
    public String get식별자() {
        return 식별자;
    }
    public void set식별자(String 식별자) {
        this.식별자 = 식별자;
    }
    public String get상품설명() {
        return 상품설명;
    }
    public void set상품설명(String 상품설명) {
        this.상품설명 = 상품설명;
    }
    public String get생산자() {
        return 생산자;
    }
    public void set생산자(String 생산자) {
        this.생산자 = 생산자;
    }
    public int get가격정보() {
        return 가격정보;
    }
    public void set가격정보(int 가격정보) {
        this.가격정보 = 가격정보;
    }
    

    @Override
    public String toString() {
        return "Pro [식별자=" + 식별자 + ", 상품설명=" + 상품설명 + ", 생산자=" + 생산자 + ", 가격정보="
                + 가격정보 + "]";
    }
    
    public Pro() {
        super();
    }
    
    
}
