package vaxter.model;

public class Kottatande extends Vaxt implements BevattnaVaxt {
    private double vaskeMangd;// inkapsling- en enda instans variabel.

    public Kottatande(String namn, double langd) { //konstruktur. namn och längd är dynamiska värden som användaren anger
        super(namn, "Proteingdryck", langd);//  anropar konstrukturn till super klassen. hårdkodat vatsketypen
        vaskeMangd = (0.2*langd) + 0.1;
    }

    @Override
    public String bevattna(){ ///Jag implementera interfacet bevattnaVaxt.
        return (" Bevatna Köttätande "+ getNamn()+ " med "+ vaskeMangd + " liter " + getVatskeTyp());
        //retunerar en string
    }
}
