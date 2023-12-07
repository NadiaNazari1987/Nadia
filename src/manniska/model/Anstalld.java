package manniska.model;

public class Anstalld extends Manniska{

    private int anstallningsNummer;
    private int lon;

    private String forsaljningsBonus;

    public Anstalld(String fullstandigName, String personnummer, String adress, int dateOfBirth, int anstallningsNummer, int lon, String forsaljningsBonus) {
        super(fullstandigName, personnummer, adress, dateOfBirth);
        this.anstallningsNummer = anstallningsNummer;
        this.lon = lon;
        this.forsaljningsBonus = forsaljningsBonus;
        // när vi ärver från en superklass, måste vi anropa en av konstruktorer hos superklassen.
        // framför class-variabler superklassen skriver vi "super" i konstruktorern.
        //framför class-variabler subklassen skriver vi "this" i konstruktoren.
    }



/*public Anstalld(int anstallningsNummer, String forsaljningsBonus, int lon) {// en konstruktor för att kunna anropa från main.

    }*/

    @Override
    public String toString() {
        return "Anstalld{" +
                "anstallningsNummer=" + anstallningsNummer +
                ", lon=" + lon +
                ", forsaljningsBonus='" + forsaljningsBonus + '\'' +
                '}';
    }

    // anropar getter och setter, ifall jag vill sätta eller ändra något värde.
    public int getAnstallningsNummer() {
        return anstallningsNummer;
    }

    public void setAnstallningsNummer(int anstallningsNummer) {
        this.anstallningsNummer = anstallningsNummer;
    }

    public String getForsaljningsBonus() {
        return forsaljningsBonus;
    }

    public void setForsaljningsBonus(String forsaljningsBonus) {
        this.forsaljningsBonus = forsaljningsBonus;
    }
}
