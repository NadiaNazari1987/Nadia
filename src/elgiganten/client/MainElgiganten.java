package elgiganten.client;

import elgiganten.databarare.Adress;
import elgiganten.databarare.Anstalld;
import elgiganten.databarare.Kund;

public class MainElgiganten {
    public static void main(String[] args) {
        Adress taraAdress = new Adress("Malmö", "Malmögatan");
        Kund taraKund = new Kund("Tara", "Nazari","1234567", taraAdress);
        System.out.println(taraKund);


        Adress tanjaAdress = new Adress( "Västrås", "västråsgatan");
        Kund tanjaKund = new Kund("tanja", "Berg", "487465674", tanjaAdress);
        System.out.println(tanjaKund);



        Adress andersAdress = new Adress("Eskustina","Tullegatan" );
        Anstalld andersAnstalld = new Anstalld("anders", "Andersson", "198709293243", andersAdress);
        System.out.println(andersAnstalld);


        Adress kalleAdress = new Adress("Sundsvall", "Danmanrksgatan");
        Anstalld kalleAnstalld = new Anstalld("kalle", "Petterson", "1985364675", kalleAdress);
        System.out.println(kalleAnstalld);

        
    }
}
