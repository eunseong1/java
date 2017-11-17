package java17.st2product;


public class Book  extends Product{
    
    public String is =" 0";
    public String jj ="저자";
    public String jb = "정보";
    //
   
    @Override
    public String toString() {
        return "Book [is=" + is + ", jj=" + jj + ", jb=" + jb + "]";
    }

    //
    public String getIs() {
        return is;
    }
  
    public void setIs(String is) {
        this.is = is;
    }
    public String getJj() {
        return jj;
    }
    public void setJj(String jj) {
        this.jj = jj;
    }
    public String getJb() {
        return jb;
    }
    public void setJb(String jb) {
        this.jb = jb;
    }
    //
    public Book() {
        super();
    }
}
