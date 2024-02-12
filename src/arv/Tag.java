package arv;

public class Tag extends Fordon {
    int antalVagnar;

    public Tag(int hastighet, int vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public void kopplaVagn() {
        antalVagnar++;
    }

    public void printMe() {
        System.out.print(" hastighet: " + super.getHastighet());
        System.out.print(" vikt: " + super.getVikt());
        System.out.print(" antal vagnar: " + this.antalVagnar);
        System.out.println();
    }
}
