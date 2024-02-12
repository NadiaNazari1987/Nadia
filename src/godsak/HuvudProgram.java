package godsak;

import godsak.PepperKaka;

public class HuvudProgram {
    public static void main(String[] args) {

        PepperKaka p1 = new PepperKaka("bil", true);/*när vi skapar konstruktur i pepperkaka classen. då måste vi ge de ett värde i huvudprogrammet.*/
        PepperKaka p2 = new PepperKaka("hus", true);/*vi tar bort setform i nästa stycken och gör allt på en och samma rad*/
        PepperKaka p3 = new PepperKaka("gubbe", true);/* då  behöver vi inte göra sätter som nedan*/
        PepperKaka p4 = new PepperKaka("gumma", false);
        PepperKaka p5 = new PepperKaka("drake", false);

        PepperKaka p6 = new PepperKaka();


        p1.printMe();




        /*
        p1.setForm("gris");
        p1.setGradningsgrad(true);

        p2.setForm("hus");
        p2.setGradningsgrad(true);

        p3.setForm("drake");
        p3.setGradningsgrad(true);
        */





    }
}
