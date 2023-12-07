package vaxter.model;

public class Kaktus extends Vaxt implements BevattnaVaxt {// infogar interface med implements
    private double vatskeMangd;//inkapsling

    public Kaktus(String namn, double langd) {//konstruktur. namn och längd är dynamiska värden som användaren anger
        super(namn, "mineralvatten", langd);// anropar konstrukturn till super klassen. hårdkodat vatsketypen.
        vatskeMangd = 0.02;// oberoende av längden.
    }

    @Override//Jag implementera interfacet bevattnaVaxt.
    public String bevattna(){
        return ("Bevatna Kaktusen "+ getNamn() +" med " + vatskeMangd +" liter "+ getVatskeTyp());
        // retunerar en string

    }
}
