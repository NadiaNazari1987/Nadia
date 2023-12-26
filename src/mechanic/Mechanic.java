package mechanic;

public class Mechanic {
    private String mekanikerNamn;

    public Mechanic(String mekanikerNamn) {
        this.mekanikerNamn = mekanikerNamn;
    }

    public String getMekanikerNamn() {
        return mekanikerNamn;
    }

    public void setMekanikerNamn(String mekanikerNamn) {
        this.mekanikerNamn = mekanikerNamn;
    }

    @Override
    public String toString() {
        return "Mekaniker{" +
                "mekanikerNamn='" + mekanikerNamn + '\'' +
                '}';
    }
}


