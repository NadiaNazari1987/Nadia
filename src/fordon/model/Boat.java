package fordon.model;

public  class Boat extends Fordon implements Service{



    // 1 privat class-variabler
    private int dodsVikt;


    public Boat(String name, String modell, int hastighet, int vikt, int dodsVikt) {
        super(name, modell, hastighet, vikt);// använder super, för att det finns inte i det egna klaseen.
        this.dodsVikt = dodsVikt;// använder this för att det finns i det egna klaseen.

    }

    public Boat(String name) {// för att kunna anropa namn från main. så måste det finnas en konstruktor som har namn som inparameter.
        super(name);// I och med att class-variabel namn finns i class-fordon, så måste det anvönda super(namn)
    }

    @Override
    public void printMe() {//Eftersom Fordon är en abstrakt klass- så måste implemnetra printMe metoden vid användning, eller göra subklasser abstrakta.

    }

    public Boat(int hastighet) {
        super(hastighet);
    }


    @Override
    public String toString() {// I och med att Fordon är abstrakt så måste alla subklasser som ärver// Fordon, ha en toString metod.
        return "Boat{" +
                "dodsVikt=" + dodsVikt +
                '}';
    }

    public int getDodsVikt() {
        return dodsVikt;
    }

    public void setDodsVikt(int dodsVikt) {
        this.dodsVikt = dodsVikt;
    }

    // Interface metoden heter INTE samma sak interface-classen
    @Override
    public void  serviceMe() {// I och med att interfacet är Void så retunerar det inget värde.
    }
}
