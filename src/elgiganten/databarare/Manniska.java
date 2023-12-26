package elgiganten.databarare;

public abstract class Manniska {

    private String namn;
    private String efterNamn;

    public Manniska(String namn, String efterNamn) {
        this.namn = namn;
        this.efterNamn = efterNamn;
    }
    @Override
    public String toString() {
        return "Manniska{" +
                "namn='" + namn + '\'' +
                ", efterNamn='" + efterNamn + '\'' +
                '}';
    }
    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getEfterNamn() {
        return efterNamn;
    }

    public void setEfterNamn(String efterNamn) {
        this.efterNamn = efterNamn;
    }

}
