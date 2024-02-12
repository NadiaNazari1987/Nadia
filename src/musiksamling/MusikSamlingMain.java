package musiksamling;

import java.util.ArrayList;
import java.util.List;

public class MusikSamlingMain {

    public static void main(String[] args) {

        List<CdSkiva> cdSkivaList = new ArrayList<>();

        CdSkiva googoosh = new CdSkiva("Sommaren","Googoosh");
        cdSkivaList.add(googoosh);

        CdSkiva leila = new CdSkiva("våren","Leila");
        cdSkivaList.add(leila);

        CdSkiva ebi = new CdSkiva("hej", "Ebi");
        cdSkivaList.add(ebi);

        CdSkiva sattar = new CdSkiva("fjärilen", "Sattar");
        cdSkivaList.add(sattar);

        CdSkiva hayedeh = new CdSkiva("jag kommer", "Hayedeh");
        cdSkivaList.add(hayedeh);

        System.out.println(cdSkivaList);
        cdSkivaList.remove(sattar);
        System.out.println(cdSkivaList);
    }
}