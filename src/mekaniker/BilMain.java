package mekaniker;

public class BilMain {
    public static void main(String[] args) {

        String bilMarke = "Bmv";
        String bilModel = "2011";

        Bil bmv = new Bil("Bmv", "2011", false);
        Bil fiat = new Bil("Fiat", "2008", false);
        Bil volvo = new Bil("Volvo", "2003", true);
        Mekaniker olleMekaniker = new Mekaniker("OlleMekaniker");

        System.out.println(bmv);
        System.out.println(fiat);
        System.out.println("De här bilen behöver köras till "+ olleMekaniker + volvo);
        System.out.println(olleMekaniker);
    }
}
