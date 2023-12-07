package fordon.model;

public class Train extends Fordon implements Service{

    //class-variabler 2 priovata
    private int antalVagnar;


    public Train(String namn, String modell, int hastighet, int vikt, int antalVagnar) {
        super(namn, modell, hastighet, vikt);
        this.antalVagnar = antalVagnar;

    }

    @Override
    public void printMe() {//eftersom Fordon är abstakt, så alltigen måste alla superklasserna implementera (printMe)
        // ifall man vill använda sig av de funktionen. Eller gör Supklasserna till abstrakt.
    }

    @Override
    public String toString() {// Eftersom Fordon är en abstrakt-class, så måste alla supklasser som extends Fordon ha en toString medtod med returtyp.
        return "Train{" +
                "antalVagnar=" + antalVagnar +
                '}';
    }

    @Override
    public void serviceMe() {// I och med att det är Void så retunerar det inget värde.

    }
}
