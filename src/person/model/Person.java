package person.model;

public class Person {
    String namn;
    String adress;
    int alder;

    public Person(String namn, String adress, int alder) {
        this.namn = namn;
        this.adress = adress;
        this.alder = alder;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        if (alder > 0) {
            this.alder = alder;
        }
    }

    public void presenteraDig() {
        System.out.println("Namn:" + namn + " Adress:" + adress + " Ålder:" + alder);
    }
}
