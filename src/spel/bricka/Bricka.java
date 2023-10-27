package spel.bricka;

public class Bricka {
    private int varde;
    private int positionX;
    private int positionY;

    public Bricka(int varde, int positionX, int positionY) {
        this.varde = varde;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getVarde() {
        return varde;
    }

    public void setVarde(int varde) {
        this.varde = varde;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
