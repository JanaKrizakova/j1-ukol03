package cz.czechitas.ukol3.model;

public class Pamet {

    private long kapacitaPamet;

    public long getKapacitaPamet() {
        return kapacitaPamet;
    }

    public void setKapacitaPamet(long kapacitaPamet) {
        this.kapacitaPamet = kapacitaPamet;
    }

    @Override
    public String toString() {
        return "kapacita paměti počítače je " + kapacitaPamet + " B.";
    }
}
