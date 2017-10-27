package java17.st2product;


public class CompatDisc extends CoversationBook{
    
    public String jm = "앨범제목";
    public String gs = "가수이름";
    //
    public String getJm() {
        return jm;
    }
    public void setJm(String jm) {
        this.jm = jm;
    }
    public String getGs() {
        return gs;
    }
    public void setGs(String gs) {
        this.gs = gs;
    }
     //
    @Override
    public String toString() {
        return "CompatDisc [jm=" + jm + ", gs=" + gs + "]";
    }
    //
    public CompatDisc() {
        super();
    }
    
   
}
