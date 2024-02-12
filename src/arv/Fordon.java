package arv;

public abstract class Fordon {
    private int hastighet;
    private int vikt;

    public Fordon(int hastighet, int vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public int getHastighet() {
        return hastighet;
    }

    public int getVikt() {
        return vikt;
    }

    public void andraHastighet(int nyHastighet) {
        this.hastighet = nyHastighet;
    }

    // en abstract metod saknar implementation och därför saknar den måsvingar
    public abstract void printMe();
}
