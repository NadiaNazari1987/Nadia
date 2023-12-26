package djur.databarare;

import java.util.Objects;

public class Lejon extends Djur{
    private int livslangd;
    private String vilkt;

    public Lejon(String djurnamn, String art, int livslangd, String vilkt) {
        super(djurnamn, art);
        this.livslangd = livslangd;
        this.vilkt = vilkt;
    }

    @Override
    public String toString() {
        String djur = super.toString();
        return djur + "Lejon{" +
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

