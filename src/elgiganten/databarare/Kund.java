package elgiganten.databarare;

public class Kund extends Manniska{
    private String kundnummer;
    private Adress adress;// referens till adress

    public Kund(String namn, String efterNamn, String kundnummer, Adress adress) {
        super(namn, efterNamn);
        this.kundnummer = kundnummer;
        this.adress = adress;
    }
    @Override
    public String toString() {
        String manniska = super.toString();// skrivs för hand ifall man vill använda calss-variabeler i sup-klassen
        return manniska + "Kund{" + // lägg till variabeln människa
                "kundnummer='" + kundnummer + '\'' +
                ", adress=" + adress +
                '}';
    }
    public String getKundnummer() {
        return kundnummer;
    }

    public void setKundnummer(String kundnummer) {
        this.kundnummer = kundnummer;
    }
}
