package cz.czechitas.ukol3;

public class Procesor {

    @Override
    public String toString() {
        return "Výrobce procesoru je " + vyrobce + ", jeho rychlost je " + rychlost + " B.";
    }

    private String vyrobce;
    private long rychlost;




    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public long getRychlost() {
        return rychlost;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }
}
