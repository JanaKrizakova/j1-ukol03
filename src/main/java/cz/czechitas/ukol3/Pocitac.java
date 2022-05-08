package cz.czechitas.ukol3;

public class Pocitac {

    boolean jeZapnuty;
    Procesor cpu;
    Pamet ram;
    Disk pevnyDisk;

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

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }
}

