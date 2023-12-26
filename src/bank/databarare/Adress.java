package bank.databarare;

import java.util.Objects;

public class Adress {
    private String ort;
    private String gata;

    public Adress(String ort, String gata) {
        this.ort = ort;
        this.gata = gata;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getGata() {
        return gata;
    }

    public void setGata(String gata) {
        this.gata = gata;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "ort='" + ort + '\'' +
                ", gata='" + gata + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(ort, adress.ort) && Objects.equals(gata, adress.gata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ort, gata);
    }
}
