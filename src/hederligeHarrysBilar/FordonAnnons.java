package hederligeHarrysBilar;

public class FordonAnnons {
    private int pris;
    private String rubrik;
    private String beskrivning;
    private int arsModell;
    private int antalMil;
    private String annonsText;

    public FordonAnnons(int pris, String rubrik, String beskrivning, int arsModell, int antalMil, String annonsText) {
        this.pris = pris;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.arsModell = arsModell;
        this.antalMil = antalMil;
        this.annonsText = annonsText;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getRubrik() {
        return rubrik;
    }

    public void setRubrik(String rubrik) {
        this.rubrik = rubrik;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public void setBeskrivning(String beskrivning) {
        this.beskrivning = beskrivning;
    }

    public int getArsModell() {
        return arsModell;
    }

    public void setArsModell(int arsModell) {
        this.arsModell = arsModell;
    }

    public int getAntalMil() {
        return antalMil;
    }

    public void setAntalMil(int antalMil) {
        this.antalMil = antalMil;
    }

    public String getAnnonsText() {
        return annonsText;
    }

    public void setAnnonsText(String annonsText) {
        this.annonsText = annonsText;
    }

    @Override
    public String toString() {
        return "FordonAnnons{" +
                "pris=" + pris +
                ", rubrik='" + rubrik + '\'' +
                ", beskrivning='" + beskrivning + '\'' +
                ", arsModell=" + arsModell +
                ", antalMil=" + antalMil +
                ", annonsText='" + annonsText + '\'' +
                '}';
    }
}
