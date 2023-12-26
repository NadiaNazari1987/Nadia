package elgiganten.databarare;

public class Anstalld extends Manniska{

    private String personnummer;
    private Adress adress;// referens till adress

    public Anstalld(String namn, String efterNamn, String personnummer, Adress adress) {
        super(namn, efterNamn);
        this.personnummer = personnummer;
        this.adress = adress;
    }
    @Override
    public String toString() {
        String manniska = super.toString();// skrivs för hand ifall man vill använda calss-variabeler i sup-klassen
        return manniska +"Anstalld{" +// lägg till variabeln människa
                "personnummer='" + personnummer + '\'' +
                "adress ='" + adress + '\'' +
                '}';
    }
    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }
}
