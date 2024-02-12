package bankomaten;
import java.text.*;
public class Konto {

    private int belopp;
    private String kontoTyp;

    private double ranteSats;

    public Konto(int belopp, String kontoTyp, double ranteSats) {
        this.belopp = belopp;
        this.kontoTyp = kontoTyp;
        this.ranteSats = ranteSats;
    }

    public int getBelopp() {
        return belopp;
    }

    public void setBelopp(int belopp) {
        this.belopp = belopp;
    }

    public String getKontoTyp() {
        return kontoTyp;
    }

    public void setKontoTyp(String kontoTyp) {
        this.kontoTyp = kontoTyp;
    }

    public double getRanteSats() {
        return ranteSats;
    }

    public void setRanteSats(double ranteSats) {
        this.ranteSats = ranteSats;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "belopp=" + belopp +
                ", kontoTyp='" + kontoTyp + '\'' +
                ", ranteSats=" + ranteSats +
                '}';
    }
}

