package java17.st2product;


public class Product {
    public String ssh = "  ";
    public String ssf = "상품설명";
    public String ssg ="생산자";
    public String gg =" 0 ";
    
    

    //
    @Override
    public String toString() {
        return "Product [ssh=" + ssh + ", ssf=" + ssf + ", ssg=" + ssg + ", gg="
                + gg + "]";
    }
    //
 
    //


    public String getSsh() {
        return ssh;
    }

    public void setSsh(String ssh) {
        this.ssh = ssh;
    }

    public String getSsf() {
        return ssf;
    }

    public void setSsf(String ssf) {
        this.ssf = ssf;
    }

    public String getSsg() {
        return ssg;
    }

    public void setSsg(String ssg) {
        this.ssg = ssg;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }
//
    public Product() {
        super();
    }
    
    
}
