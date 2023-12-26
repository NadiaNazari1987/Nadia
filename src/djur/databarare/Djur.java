package djur.databarare;

public abstract class Djur {

    private String djurnamn;
    private String art;

    public Djur(String djurnamn, String art) {
        this.djurnamn = djurnamn;
        this.art = art;
    }

    @Override
    public String toString() {
        return "Djur{" +
                "djurnamn='" + djurnamn + '\'' +
                ", art='" + art + '\'' +
                '}';
    }

    public String getDjurnamn() {
        return djurnamn;
    }

    public void setDjurnamn(String djurnamn) {
        this.djurnamn = djurnamn;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }
}
