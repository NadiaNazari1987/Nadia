package personlistor.databarare;

import java.util.Objects;

public class Larare extends Person {

    private int anstallningsnummer;
    private String lon;

    private String avdelning;


    public Larare(String name, String efterNamne, String personnummer, String dateOfBirth, String adress, int anstallningsnummer, String lon, String avdelning) {
        super(name, efterNamne, personnummer, dateOfBirth, adress);
        this.anstallningsnummer = anstallningsnummer;
        this.lon = lon;
        this.avdelning = avdelning;
    }

    public Larare(String name) {
        super(name);
        this.anstallningsnummer = anstallningsnummer;
    }


    @Override
    public String toString() {
        return "Larare{" +
                "anstallningsnummer=" + anstallningsnummer +
                ", lon='" + lon + '\'' +
                ", avdelning='" + avdelning + '\'' +
                '}';
    }

    public int getAnstallningsnummer() {
        return anstallningsnummer;
    }

    public void setAnstallningsnummer(int anstallningsnummer) {
        this.anstallningsnummer = anstallningsnummer;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getAvdelning() {
        return avdelning;
    }

    public void setAvdelning(String avdelning) {
        this.avdelning = avdelning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Larare larare = (Larare) o;
        return anstallningsnummer == larare.anstallningsnummer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(anstallningsnummer);
    }
}
