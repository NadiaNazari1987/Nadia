package fordon.model;

public interface Service {
    public void serviceMe();

    int pris = 25;

    default int getPris(){
        return pris;
    }
}

/* Skapat en interface, de kan inte instantieras  och saknar konstruktor.
    // just nu ha vi en enda metod i interfacet. den ska vara void.
    // En interface få innehålla hur många metoder som hest. finns inga begränsningar.
    // interface kan inte instantieras- samma som abstarkta klasser.
    // alla metoder i interface är abstrakta, förutom default/standrad- metoderna..// gör man en sånt där metod i interface, så måste man skriva default framför.
    // man kan instantioera variabler i interface, men de kommer att vara iprincip Finala, vi kommer inte att kunna ändra det. endast vid ett tillfälle.'
    // däeför behövs alldrig ordet abstact när man definerar en interface.
    //interface är publika..

 */
