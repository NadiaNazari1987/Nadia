package hederligeHarrysBilar;

public class BilAnnons extends FordonAnnons implements Publishable{
    private String farg;
    private String annonsText;
    private boolean sommarDack;
    private boolean vinterDack;

    public BilAnnons(int pris, String rubrik, String beskrivning, int arsModell, int antalMil, String annonsText, String farg, String annonsText1, boolean sommarDack, boolean vinterDack) {
        super(pris, rubrik, beskrivning, arsModell, antalMil, annonsText);
        this.farg = farg;
        this.annonsText = annonsText1;
        this.sommarDack = sommarDack;
        this.vinterDack = vinterDack;
    }

    public String getFarg() {
        return farg;
    }

    public void setFarg(String farg) {
        this.farg = farg;
    }

    @Override
    public void setAnnonsText(String annonsText) {
        this.annonsText = annonsText;
    }

    public boolean isSommarDack() {
        return sommarDack;
    }

    public void setSommarDack(boolean sommarDack) {
        this.sommarDack = sommarDack;
    }

    public boolean isVinterDack() {
        return vinterDack;
    }

    public void setVinterDack(boolean vinterDack) {
        this.vinterDack = vinterDack;
    }

    @Override
    public String toString() {
        String superString = super.toString();
        return superString +"BilAnnons{" +
                "farg='" + farg + '\'' +
                ", annonsText='" + annonsText + '\'' +
                ", sommarDack=" + sommarDack +
                ", vinterDack=" + vinterDack +
                '}';
    }
    public String publishable(){
        return ("publishable"+ getRubrik()+getPris());
    }
}
