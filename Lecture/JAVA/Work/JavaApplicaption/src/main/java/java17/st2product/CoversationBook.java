package java17.st2product;


public class CoversationBook extends Book {
    
    public String hh = "회화책";
   //
    public String getHh() {
        return hh;
    }

    public void setHh(String hh) {
        this.hh = hh;
    }
    //

    @Override
    public String toString() {
        return "CoversationBook [hh=" + hh + "]";
    }
   //

    public CoversationBook() {
        super();
    }
    
}
