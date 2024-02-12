package bankomaten;

public class Kund extends Manniska{

    private int kundNummer;
    private Konto konto;// referens till konto

    public Kund(String namn, String personnummer, int kortNummer, Konto konto) {
        super(namn, personnummer);
        this.kundNummer = kortNummer;
        this.konto = konto;
    }

    public int getKundNummer() {
        return kundNummer;
    }

    public void setKundNummer(int kundNummer) {
        this.kundNummer = kundNummer;
    }

    public Konto getKonto() {
        return konto;
    }

    public void setKonto(Konto konto) {
        this.konto = konto;
    }

    @Override
    public String toString() {
        return "Kund{" +
                "kundNummer=" + kundNummer +
                ", konto=" + konto +
                '}';
    }
}
