package manniska.model;

public abstract class Manniska {

    // class-variabler
    private String fullstandigName;
    private String personnummer;
    private String adress;
    private int dateOfBirth;


     // konstruktor med calss-variabler som inparameter
    public Manniska(String fullstandigName, String personnummer, String adress, int dateOfBirth) {
        this.fullstandigName = fullstandigName;
        this.personnummer = personnummer;
        this.adress = adress;
        this.dateOfBirth = dateOfBirth;
    }


    // anropar getter och setter, ifall jag vill sätta eller ändra något värde.
    public String getFullstandigName() {
        return fullstandigName;
    }

    public void setFullstandigName(String fullstandigName) {
        this.fullstandigName = fullstandigName;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void printMe() {
    }
}
