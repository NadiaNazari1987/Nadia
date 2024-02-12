package hederligeHarrysBilar;

public class HusvagnAnnons extends FordonAnnons implements Publishable {

    private String annonsText;
    private int antalBaddar;
    private boolean dush;
    private boolean kok;

    public HusvagnAnnons(int pris, String rubrik, String beskrivning, int arsModell, int antalMil, String annonsText, String annonsText1, int antalBaddar, boolean dush, boolean kok) {
        super(pris, rubrik, beskrivning, arsModell, antalMil, annonsText);
        this.annonsText = annonsText1;
        this.antalBaddar = antalBaddar;
        this.dush = dush;
        this.kok = kok;
    }
    @Override
    public void setAnnonsText(String annonsText) {
        this.annonsText = annonsText;
    }

    public int getAntalBaddar() {
        return antalBaddar;
    }

    public void setAntalBaddar(int antalBaddar) {
        this.antalBaddar = antalBaddar;
    }

    public boolean isDush() {
        return dush;
    }

    public void setDush(boolean dush) {
        this.dush = dush;
    }

    public boolean isKok() {
        return kok;
    }

    public void setKok(boolean kok) {
        this.kok = kok;
    }

    @Override
    public String toString() {
        String superString = super.toString();
        return superString + "HusvagnAnnons{" +
                "annonsText='" + annonsText + '\'' +
                ", antalBaddar=" + antalBaddar +
                ", dush=" + dush +
                ", kok=" + kok +
                '}';
    }
    public String publishable(){
        return ("publishable"+ getRubrik()+getPris());
    }
}
