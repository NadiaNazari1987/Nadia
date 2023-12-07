package manniska.model;

public class Kund extends Manniska{

    private String varuinkorg;
    private int kundRabbat;

    public Kund(String varuinkorg, int kundRabbat, String fullstandigName, String personnummer, String adress, int dateOfBirth) {//konstrutktor
        super(fullstandigName, personnummer, adress, dateOfBirth);// människans konstruktor anropas, det är viktig eftersom superklasssens class-variabeler måste instansieras.
        this.varuinkorg = varuinkorg;// kundens class-variabeler instanseras
        this.kundRabbat = kundRabbat;
        // när vi ärver från en superklass, måste vi anropa en av konstruktorer hos superklassen.
        // framför class-variabler superklassen skriver vi "super" i konstruktorern.
        //framför class-variabler subklassen skriver vi "this" i konstruktoren.
    }

    @Override
    public String toString() {
        return "Kund{" +
                "varuinkorg='" + varuinkorg + '\'' +
                ", kundRabbat=" + kundRabbat +
                '}';
    }

    // anropar getter och setter, ifall jag vill sätta eller ändra något värde.
    public String getVaruinkorg() {
        return varuinkorg;
    }

    public void setVaruinkorg(String varuinkorg) {
        this.varuinkorg = varuinkorg;
    }

    public int getKundRabbat() {
        return kundRabbat;
    }

    public void setKundRabbat(int kundRabbat) {
        this.kundRabbat = kundRabbat;
    }
}
