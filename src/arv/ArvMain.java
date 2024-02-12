package arv;

public class ArvMain {
    public static void main(String[] args) {
        Bil volvo = new Bil(120,2500,5,1);
        Tag tagTillGoteborg = new Tag(200,30000,5);
        // Fordon fordon = new Fordon(30, 100);

        Fordon fordon = new Bil(160, 2300, 7, 2);
        fordon = new Tag(200,30000,5);;

        System.out.println("Volvo");
        volvo.printMe();
        System.out.println("Tåg till Göteborg");
        tagTillGoteborg.printMe();
        System.out.println("Mercedes");
        fordon.printMe();
    }
}
