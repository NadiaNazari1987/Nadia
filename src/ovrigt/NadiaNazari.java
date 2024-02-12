package ovrigt;

import java.sql.SQLOutput;
import java.util.*;

public class NadiaNazari {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        while (true){
            System.out.println("n? ( ett tal <= 0 för att sluta)");
            int n = scan.nextInt();

            if (n<0)
                break;
            int summa = 0 ;
            int k = 1;
            while (k < n){
                summa = summa + k;
                k=k+1;
            }
            System.out.println("summan blir"+ summa);

        }
    }
}
