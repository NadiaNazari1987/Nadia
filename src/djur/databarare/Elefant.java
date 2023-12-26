package djur.databarare;

import java.util.Objects;

public class Elefant extends Djur{

    private int livslangd;
    private String vilkt;

    public Elefant(String djurnamn, String art, int livslangd, String vilkt) {
        super(djurnamn, art);
        this.livslangd = livslangd;
        this.vilkt = vilkt;
    }

    @Override
    public String toString() {
        String djur = super.toString();
        return djur + "Elefant{" +
                "livslangd=" + livslangd +
                ", vilkt='" + vilkt + '\'' +
                '}';
    }

    public int getLivslangd() {
        return livslangd;
    }

    public void setLivslangd(int livslangd) {
        this.livslangd = livslangd;
    }

    public String getVilkt() {
        return vilkt;
    }

    public void setVilkt(String vilkt) {
        this.vilkt = vilkt;
    }



}
