package personlistor.client;

import personlistor.databarare.Kurs;
import personlistor.databarare.Larare;
import personlistor.databarare.Student;

public class PersonClient {
    public static void main(String[] args) {

        Student peter = new Student("Peter");

        Kurs persiska = new Kurs("Persiska");
        Larare larare = new Larare("Kalle");


        System.out.println(peter);
        System.out.println(persiska);
        System.out.println(larare);

    }


}