package vaxter.model;

public class Palm extends Vaxt implements BevattnaVaxt {
    private double vatskeMangd;// endast en instans variabel-Inkapsling

    public Palm(String namn, double langd) {//konstruktur. namn och längd är dynamiska värden som användaren anger
        super(namn, "kranvatten", langd);// anropar konstrukturn till super klassen. hårdkodat vatsketypen
        vatskeMangd = 0.5*langd;
    }

    @Override
    public String bevattna(){ //Jag implementera interfacet bevattnaVaxt.
        return (" Bevatna Palmen " + getNamn()+ " med " + vatskeMangd + " liter "+ getVatskeTyp());
        //retunerar en string
    }
}

