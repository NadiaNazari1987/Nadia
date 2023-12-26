package mechanic;

public class CarMain {
    public static void main(String[] args) {

        String bilMarke = "Bmv";
        String bilModel = "2011";

        Car bmv = new Car("Bmv", "2011", false);
        Car fiat = new Car("Fiat", "2008", false);
        Car volvo = new Car("Volvo", "2003", true);
        Mechanic olleMekaniker = new Mechanic("OlleMekaniker");

        System.out.println(bmv);
        System.out.println(fiat);
        System.out.println("De här bilen behöver köras till "+ olleMekaniker + volvo);
        System.out.println(olleMekaniker);
    }
}
