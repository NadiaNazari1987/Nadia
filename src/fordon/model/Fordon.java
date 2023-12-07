package fordon.model;

public abstract class Fordon {
    // privata class-variabler
    private String name;
    private String modell;
    private int hastighet;
    private int vikt;


// deklarerar konstruktor för de olika privata class-variabler, Konstruktorn tar in 5 parametrar
// använder this, eftersom dessa variabler finns med i det egna klassen dvs Fordon.java
// EN class kan har många olika konstruktorer. tex en som ta olika parametrar som alla class-variabeler.
// eller en konstruktor som endast tar en specefik parameter.
    public Fordon(String name, String model, int hastighet, int vikt) {
        name = name;
        this.modell = model;
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public Fordon(String name) {
        this.name = name;
    }

    public Fordon() {// En default konstruktor som retunerar en fordon tillbaka.

    }
    public abstract void printMe();

    // I och med att fordon är nu abstrakt kan vi inte ha en objekt av typen Fordon
    // men vi  kan ha icke abstrakta medtoder. to String är inte abstrakt
    @Override
    public abstract String toString(); /*{// Vi kan göra om det till en abstrakt metod,
        // genom att skriva abstrakt efter public och innan String
        // då kommer java att klaga. Vi måste då ta bort implementationen mellan måsvingarna.
        // I och med att fordon är abstrakt så måste alla supklasser som extends Fordon ha den här toString metoden, utan implementation
       return "Fordon{" +//
                "name='" + name + '\'' +
                ", modell='" + modell + '\'' +
                ", hastighet=" + hastighet +
                ", vikt=" + vikt +
                '}';*/


    public Fordon(int hastighet) {
        this.hastighet = hastighet;
    }

    // deklarerar get-funktionen för namn,model, hastighet och vikt. Ifall jag vill få ut någon av dessa variabler
    public String getName() {
        return name;
    }

    public String getModell() {
        return modell;
    }

    public int getHastighet() {
        return hastighet;
    }

    public int getVikt() {
        return vikt;
    }
// deklararear set-funktionen för namn, model, hastighet och vikt. Ifall jag vill ändra något tex hastighet.
    public void setName(String name) {
        name = name;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setHastighet(int hastighet) {
        this.hastighet = hastighet;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }
}
