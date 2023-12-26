package djur.databarare;

import java.util.Objects;

public class Bjorn extends Djur{
    private String vikt;
    private int livslangd;

    public Bjorn(String djurnamn, String art, String vikt, int livslangd) {
        super(djurnamn, art);
        this.vikt = vikt;
        this.livslangd = livslangd;
    }

    @Override
    public String toString() {
       String djur = super.toString();
        return djur +"Bjorn{" +
                "vikt='" + vikt + '\'' +
                ", livslangd=" + livslangd +
                '}';
    }

    public String getVikt() {
        return vikt;
    }

    public void setVikt(String vikt) {
        this.vikt = vikt;
    }

    public int getLivslangd() {
        return livslangd;
    }

    public void setLivslangd(int livslangd) {
        this.livslangd = livslangd;
    }
}

