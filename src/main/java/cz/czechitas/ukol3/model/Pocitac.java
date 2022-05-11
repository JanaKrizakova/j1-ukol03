package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public String toString() {
        String result;

        if (jeZapnuty) {
            result = "Zapnutý počítač: ";
        } else {
            result = "Vypnutý počítač: ";
        }

        if (cpu != null) {
            result = result + cpu.toString();
            result = result + ", ";
        }

        if (ram != null) {
            result = result + ram.toString();
            result = result + ", ";
        }

        if (pevnyDisk != null) {
            result = result + pevnyDisk.toString();
        }

        return result;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.out.println("Počítač je již zapnutý.");
        } else if(cpu == null) {
            System.out.println("V počítači není procesor, nelze ho zapnout.");
        } else if(ram == null) {
            System.out.println("V počítači není paměť, nelze ho zapnout.");
        } else if(pevnyDisk == null) {
            System.out.println("V počítači není pevný disk, nelze ho zapnout.");
        } else {
            jeZapnuty = true;
            System.out.println("Počítač se zapnul.");
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            this.jeZapnuty = false;
            System.out.println("Počítač se vypnul.");
        }
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public void vytvorSouborOVelikosti(long velikost) {

        if (jeZapnuty) {
            if ((pevnyDisk.getVyuziteMisto() + velikost) <= pevnyDisk.getKapacita()) {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
                System.out.println("Soubor byl vytvořen.");
            } else {
                System.out.println("Na disku není dostatek volného místa.");
            }

        } else {
            System.err.println("Počítač je vypnutý, zapněte jej prosím.");
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {

        if (jeZapnuty) {
            if ((pevnyDisk.getVyuziteMisto() - velikost) >= 0) {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
                System.out.println("Soubor byl smazán. Zbývající volné místo na disku je: "
                        + (pevnyDisk.getKapacita() - pevnyDisk.getVyuziteMisto()));
            } else {
                System.out.println("Na disku není žádný soubor.");
            }

        } else {
            System.err.println("Počítač je vypnutý, zapněte jej prosím.");
        }
    }

}

