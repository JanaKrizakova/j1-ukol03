package cz.czechitas.ukol3;

public class Disk {

    private long kapacitaDisk;
    private long vyuziteMisto;

    public long getKapacitaDisk() {
        return kapacitaDisk;
    }

    public void setKapacitaDisk(long kapacitaDisk) {
        this.kapacitaDisk = kapacitaDisk;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    @Override
    public String toString() {
        return "kapacita disku " + kapacitaDisk + " B." + ", " +
                "využité místo je " + vyuziteMisto +  " B. ";
    }
}