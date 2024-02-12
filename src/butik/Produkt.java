package butik;

// Produkt är emutable, vi kan inte ändra en produkt efter vi skapat den då det inte finns några setter metoder
public class Produkt {
    private String marke;
    private String farg;
    private String storlek;
    private float pris;
    private int antal;

    public Produkt(String marke, String farg, String storlek, float pris, int antal) {
        this.marke = marke;
        this.farg = farg;
        this.storlek = storlek;
        this.pris = pris;
        this.antal = antal;
    }

    public String getMarke() {
        return marke;
    }

    public String getFarg() {
        return farg;
    }

    public String getStorlek() {
        return storlek;
    }

    public float getPris() {
        return pris;
    }

    public int getAntal() {
        return antal;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "marke='" + marke + '\'' +
                ", färg='" + farg + '\'' +
                ", storlek='" + storlek + '\'' +
                ", pris='" + pris + '\'' +
                ", antal='" + antal + '\'' +
                "}\r\n";
    }
}
