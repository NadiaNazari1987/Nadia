package fordon.model;

public class Car extends Fordon implements Service{


    //classvariabler 2 priovata instansvariabler
    private int antalVaxlar;
    private int vaxelJustNu;

    public Car(String namn, String modell, int hastighet, int vikt, int antalVaxlar, int vaxelJustNu) {
        super(namn, modell, hastighet, vikt);
        this.antalVaxlar = antalVaxlar;
        this.vaxelJustNu = vaxelJustNu;
    }

    public Car(String modell) {
        super(modell);
    }

    @Override
    // implementera printMe metoden, eftersom superklassen-Fordon är abstarkt.
    public void printMe() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "antalVaxlar=" + antalVaxlar +
                ", vaxelJustNu=" + vaxelJustNu +
                '}';
    }

    @Override
    public void serviceMe() {// I och med att det är Void så retunerar det inget värde.

    }
}
