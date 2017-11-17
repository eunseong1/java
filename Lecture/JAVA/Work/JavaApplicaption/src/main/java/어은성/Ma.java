package 어은성;


public class Ma extends ex5{
    private int bonus = 0;

    
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Ma [bonus=" + bonus + ", toString()=" + super.toString() + "]";
    }

    public Ma(int bonus) {
        super();
        this.bonus = bonus;
    }

    public Ma() {
        super();
    }
    
    
}
