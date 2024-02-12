package adressbok;

import java.util.Objects;

public class Adress {
    private String ort;
    private String postnummer;
    private String gata;

    public Adress(String ort, String postnummer, String gata) {
        this.ort = ort;
        this.postnummer = postnummer;
        this.gata = gata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(ort, adress.ort) && Objects.equals(postnummer, adress.postnummer) && Objects.equals(gata, adress.gata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ort, postnummer, gata);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "ort='" + ort + '\'' +
                ", postnummer='" + postnummer + '\'' +
                ", gata='" + gata + '\'' +
                '}';
    }
}
