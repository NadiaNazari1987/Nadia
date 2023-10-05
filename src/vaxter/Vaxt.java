package vaxter;

public class Vaxt {
    private String namn;//Privata instansvariabel är inkapsling(för den är private)
    private String vatskeTyp;
    private double langd;

    public Vaxt(String namn, String vatskeTyp, double langd) { //deklarerat konstrukturn för växt som tar 3 parametrar
        this.namn = namn;// sätter instans variablerna till värderna som kommer in
        this.vatskeTyp = vatskeTyp;
        this.langd = langd;
    }

    public String getNamn() {// get funktion
        return namn;
    }//deklerera get-funktioner

    public String getVatskeTyp() {
        return vatskeTyp;
    }

    public double getLangd() {
        return langd;
    }
}


