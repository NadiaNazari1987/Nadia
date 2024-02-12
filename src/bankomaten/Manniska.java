package bankomaten;

public class Manniska {

    private String namn;
    private String personnummer;

    public Manniska(String namn, String personnummer) {
        this.namn = namn;
        this.personnummer = personnummer;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    @Override
    public String toString() {
        return "Manniska{" +
                "namn='" + namn + '\'' +
                ", personnummer='" + personnummer + '\'' +
                '}';
    }
}
