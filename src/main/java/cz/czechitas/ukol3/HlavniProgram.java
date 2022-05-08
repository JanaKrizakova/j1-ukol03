package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

public class HlavniProgram {

    public static void main(String... args) {

        System.out.println("Program spuštěn.");

        Pocitac janinNotebook;
        janinNotebook = new Pocitac();
        System.out.println(janinNotebook.toString());

        janinNotebook.zapniSe();

        Procesor janinProcesor = new Procesor();
        janinProcesor.setRychlost(3_300_000_000L);
        janinProcesor.setVyrobce("AMD");

        Pamet janinaPamet = new Pamet();
        janinaPamet.setKapacitaPamet(8_000_000_000L);

        Disk janinDisk = new Disk();
        janinDisk.setKapacitaDisk(476_000_000_000L);

        janinNotebook.setCpu(janinProcesor);
        janinNotebook.setRam(janinaPamet);
        janinNotebook.setPevnyDisk(janinDisk);

        System.out.println(janinNotebook.toString());

        janinNotebook.zapniSe();
        janinNotebook.zapniSe();

        janinNotebook.vytvorSouborOVelikosti(8_014_235_001L);
        System.out.println(janinNotebook.toString());

        janinNotebook.vymazSouboryOVelikosti(4_000_154_001L);

        janinNotebook.vypniSe();
        janinNotebook.vymazSouboryOVelikosti(1_000_000_000L);

        janinNotebook.vypniSe();
        janinNotebook.vypniSe();
    }
}
