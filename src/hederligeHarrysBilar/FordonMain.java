package hederligeHarrysBilar;

public class FordonMain {
    public static void main(String[] args){


        BilAnnons volvo240 = new BilAnnons(240000, "Den perfekta bilen","En bil att ha i många år framåt",
                2010,9000, "Volvo 240","svart","fin bil",true, false);
        System.out.println(volvo240);



        HusvagnAnnons husvanCabby = new HusvagnAnnons(500000, "Den frächa husvagnen någonsin",
                " bra utrustning",2024,0, "Helt ny husvagn","fin", 2,
                true, true);
        System.out.println(husvanCabby);




        MotoCykelAnnons motorCykelSuzuki = new MotoCykelAnnons(199000,"Motorcykel",
                "Det snabbaste motorcykeln", 2020,2000,"motorcykel",
                "3500","kedja"," perfekt för dig");
        System.out.println(motorCykelSuzuki);

    }
}
