package vaxter.test;

import org.junit.Test;
import vaxter.Kaktus;

import static org.junit.Assert.assertEquals;

public class KaktusTest {
    // ToDo: lära mig hur man installerar JUnit
    // ToDo: lära mig hur man importerar static för testfall/JUnit
    @Test
    public void bevatnaKaktusTest() {
        // anropar riktig kod som jag vill testa/verifiera/asserta
        Kaktus kaktus = new Kaktus("Fredrik", 20);
        // testar/verifierar att kaktus klassen/implementationen ger det resultat som jag förväntar mig
        assertEquals(kaktus.getNamn(),"Fredrik");
        assert(kaktus.getLangd() == 20);
        assert(kaktus.getVatskeTyp().equals("mineralvatten"));
    }

    @Test
    public void bevatnaKaktusTestSkaBliFel() { // det här testet ska visa hur det blir när kod INTE verifieras/testat/assertas korrekt
        // anropar riktig kod som jag vill testa/verifiera/asserta
        Kaktus kaktus = new Kaktus("Fredrik", 20);
        // testar/verifierar att kaktus klassen/implementationen ger det resultat som jag förväntar mig
        assertEquals(kaktus.getVatskeTyp(),"vatten"); // den här blir FEL assertad!
    }
}
