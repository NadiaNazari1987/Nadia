package elgiganten.databarare;

public class Adress {

    private  String ort;
    private String adress;

    public Adress(String ort, String adress) {
        this.ort = ort;
        this.adress = adress;
    }
    public Adress(String adress) {
        this.adress = adress;
    }// förstår inte den metoden
    @Override
    public String toString() {
        return "Adress{" +
                "ort='" + ort + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
