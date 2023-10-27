package spel.bricka;

import java.util.ArrayList;
import java.util.List;

public class SpelLogik {
    private List<Bricka> brickor;
    private int tomPositionX;
    private int tomPositionY;

    public SpelLogik() {
        brickor = new ArrayList<>();
        tomPositionX = 4;
        tomPositionY = 1;
    }

    public List<Bricka> genereraBrickor() {
        return null;
    }

    public void bytPosition(Bricka bricka, int tomPositionX,int tomPositionY) {

    }

   public boolean klaratAvSpelet(List<Bricka> brickor) {
        return false;
   }

}
