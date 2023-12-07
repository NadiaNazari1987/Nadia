package fordon.model;

public class Bike extends Fordon implements Service{


    //class-variabler 2 priovata
   private int antalVaxlarJustNu;


   final int antalvaxel= 6;// vi måste initisera vår final varibel och ge den ett värde.
    // vi får bara ge finala variabeler värdet vid ett tillfället. går inte att ändra värdet vid deklarationen.



    public Bike(String namn, String modell, int hastighet, int vikt, int antalVaxlarJustNu) {
        super(namn, modell, hastighet, vikt);
        this.antalVaxlarJustNu = antalVaxlarJustNu;

    }


    public Bike(String namn) {// eftersom bike extendar fordon, så måste bike konstruktor alltid anropa en av fordon konstruktionerna. i form av super
        super(namn);
    }

    @Override
    public void printMe() {
        System.out.println( " namn är " + getName() + ", modellen är " + getModell()+ ", hastigheten är " + getHastighet()+ ", och vikten för bilen är " + getVikt() + ", antalväxlar just nu är " + antalVaxlarJustNu);
    }

    @Override
    public String toString() {// I och med att Fordon är abstrakt så måste alla subklasser som extends Fordon ha en toString metod.
        return "Bike{" +
                "antalVaxlarJustNu=" + antalVaxlarJustNu +
                '}';
    }

    @Override
    public void serviceMe() {// I och med att det är Void så retunerar det inget värde.
    }
}
