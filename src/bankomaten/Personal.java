package bankomaten;

public class Personal extends Manniska{

    private int lon;
    private Konto konto;// referens till konto

    public Personal(String namn, String personnummer, int lon, Konto konto) {
        super(namn, personnummer);
        this.lon = lon;
        this.konto = konto;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public Konto getKonto() {
        return konto;
    }

    public void setKonto(Konto konto) {
        this.konto = konto;
    }

    @Override
    public String toString() {
        String superString = super.toString();// måste skrivas för hand ifall man vill anropa class-variabeler som finns i super-klassen(String superString = super.toString();)
        return superString +"Personal{" + //Måste skrivas för hand (superString)
                "lon=" + lon +
                ", konto=" + konto +
                '}';
    }
}
