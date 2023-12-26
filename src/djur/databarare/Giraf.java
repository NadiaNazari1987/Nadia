package djur.databarare;

import java.util.Objects;

public class Giraf extends Djur{

    private String vilkt;
    private int livslangd;

    public Giraf(String djurnamn, String art, String vilkt, int livslangd) {
        super(djurnamn, art);
        this.vilkt = vilkt;
        this.livslangd = livslangd;
    }

    @Override
    public String toString() {
        String djur = super.toString();
        return djur + "Giraf{" +
                "vilkt='" + vilkt + '\'' +
                ", livslangd=" + livslangd +
                '}';
    }

    public String getVilkt() {
        return vilkt;
    }

    public void setVilkt(String vilkt) {
        this.vilkt = vilkt;
    }

    public int getLivslangd() {
        return livslangd;
    }

    public void setLivslangd(int livslangd) {
        this.livslangd = livslangd;
    }

}
