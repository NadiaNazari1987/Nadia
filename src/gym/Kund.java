package gym;

import java.util.Date;

public class Kund {
    private String personnummer; // väljer string då vi inte behöver göra beräkningar på personnummer (slipper konvertera)
    private String namn; // för och efter namn
    private Date betaldMedlemskap;

    // Har en tom default konstruktor som inte tar in några parameters.
    // Vidare skapar jag get och set för att en kund skapas på flera olika ställen i min kod.

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public Date getBetaldMedlemskap() {
        return betaldMedlemskap;
    }

    public void setBetaldMedlemskap(Date betaldMedlemskap) {
        this.betaldMedlemskap = betaldMedlemskap;
    }
}
