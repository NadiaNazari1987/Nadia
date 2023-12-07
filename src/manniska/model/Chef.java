package manniska.model;

public class Chef extends Manniska{

    private int chefNummer;
    private int bonus;
    private int lon;


    public Chef(String fullstandigName, String personnummer, String adress, int dateOfBirth, int chefNummer, int bonus, int lon) {
        super(fullstandigName, personnummer, adress, dateOfBirth);
        this.chefNummer = chefNummer;
        this.bonus = bonus;
        this.lon = lon;
        // när vi ärver från en superklass, måste vi anropa en av konstruktorer hos superklassen.
        // framför class-variabler superklassen skriver vi "super" i konstruktorern.
        //framför class-variabler subklassen skriver vi "this" i konstruktoren.
    }

    @Override
    public String toString() {
        return "Chef{" +
                "chefNummer=" + chefNummer +
                ", bonus=" + bonus +
                ", lon=" + lon +
                '}';
    }


    // anropar getter och setter, ifall jag vill sätta eller ändra något värde.

    public int getChefNummer() {
        return chefNummer;
    }

    public void setChefNummer(int chefNummer) {
        this.chefNummer = chefNummer;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
// man ska aldrig hårdkodda en class-variabel i java. vill man ge class-variabeln ett värde,
// så kan man göra det alltigen via konstroktor eller via set-funktionen.
// hårdkoddningen skapar en objekt i onödan som kostar prestanda. det tar minne,
// det blir otydligt kod om du intiantiera en class-variabel, du skapar ett värde som senare överridas.
