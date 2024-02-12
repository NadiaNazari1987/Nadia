package arv;

public class Bil extends Fordon {

    int antalVaxlar;
    int vaxelJustNu;

    public Bil(int hastighet, int vikt, int antalVaxlar, int vaxelJustNu) {
        super(hastighet, vikt);
        this.antalVaxlar = antalVaxlar;
        this.vaxelJustNu = vaxelJustNu;
    }

    public void valxa(int nyVaxelJsutNu) {
        this.vaxelJustNu = nyVaxelJsutNu;
    }

    @Override
    public void printMe() {
        System.out.print(" hastighet: " + super.getHastighet());
        System.out.print(" vikt: " + super.getVikt());
        System.out.print(" antal växlar: " + this.antalVaxlar);
        System.out.print(" växel just nu: " + this.vaxelJustNu);
        System.out.println();
    }
}
