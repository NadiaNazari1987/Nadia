package fordon.client;

import fordon.model.Bike;

import java.util.ArrayList;
import java.util.List;

public class FordonMain {
    public static void main(String[] args) {
       /* Bike minCykel = new Bike("prickig");// skapa en instans, nu kan man anropa "Bike"
        System.out.println(minCykel.getName());

        Bike alisCykel = new Bike( "randig", "nike",  + 100, 5, 12);
        System.out.println("namnet på min cykel är " + alisCykel.getName());

        Boat myBoat = new Boat("Cinderella", "segelBoat", 200 ,  5000 , 4500);
        System.out.println("Hastigheten på min båt är " + myBoat.getHastighet() + "km per timme");

        Car mycar = new Car("bmv", "sport", 250 , 2600, 6, 5);
        System.out.println("Modellen på min bil är " + mycar.getModell());

        Train mytrain = new Train( "RödaLinjen", "snabbtåg", 450, 6000, 35);
        System.out.println(mytrain.getVikt() + " ton är vikten på tåget");



        System.out.println("Min cykel är " + alisCykel.getName() + " den är av modellen " + alisCykel.getModell()
                + " hastigheten på min cykel är " + alisCykel.getHastighet() + " km per timme " +" Vikten på min cykel är "
                +  alisCykel.getVikt()+ " kg");
        //Fordon fordon = new Fordon(); // Efetrsom Fordon är abstrakt kan vi inte instantiera en objekt av det classen.

        // Boat minBoat = new Boat(1000);
*/
        Bike alisCykel = new Bike( "randig", "nike",  + 100, 5, 12);
        Bike nadiasCykel = new Bike("rambo", "Cresent", 40, 5,20);
        Bike ryansCykel = new Bike("rambo", "Cresent", 40, 5,20);
        Bike adriansCykel = new Bike("rambo", "Cresent", 40, 5,20);

       /* System.out.println("Min cykel är " + alisCykel.getName() + " den är av modellen " + alisCykel.getModell()
                + " hastigheten på min cykel är " + alisCykel.getHastighet() + " km per timme " +" Vikten på min cykel är "
                +  alisCykel.getVikt()+ " kg");

        System.out.println("Min cykel är " + nadiasCykel.getName() + " den är av modellen " + nadiasCykel.getModell()
                + " hastigheten på min cykel är " + nadiasCykel.getHastighet() + " km per timme " +" Vikten på min cykel är "
                +  nadiasCykel.getVikt()+ " kg");*/

        List<Bike> cyklelSamling = new ArrayList<>();
        cyklelSamling.add(alisCykel);
        cyklelSamling.add(nadiasCykel);
        cyklelSamling.add(ryansCykel);
        cyklelSamling.add(adriansCykel);
/*
        for (Bike bike : cyklelSamling) {
            System.out.println("Min cykel är " + bike.getName() + " den är av modellen " + bike.getModell()
                    + " hastigheten på min cykel är, " + bike.getHastighet() + " km per timme " +" Vikten på min cykel är "
                    +  bike.getVikt()+ " kg");
        }*/


        for (Bike bike : cyklelSamling) {
            bike.printMe();
        }
    }
}





