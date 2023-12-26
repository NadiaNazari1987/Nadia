package mekaniker;

public class Bil {

    private String marke;
    private String modell;
    private boolean trasig;

    public Bil(String marke, String modell, boolean trasig) {
        this.marke = marke;
        this.modell = modell;
        this.trasig = trasig;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public boolean isTrasig() {
        return trasig;
    }

    public void setTrasig(boolean trasig) {
        this.trasig = trasig;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "marke='" + marke + '\'' +
                ", modell='" + modell + '\'' +
                ", trasig=" + trasig +
                '}';
    }
}

