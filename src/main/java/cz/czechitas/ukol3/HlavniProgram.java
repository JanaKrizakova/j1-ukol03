package cz.czechitas.ukol3;

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
        System.out.println(janinNotebook.toString());
        janinNotebook.vypniSe();

        janinNotebook.vypniSe();
        janinNotebook.vypniSe();
    }
}
