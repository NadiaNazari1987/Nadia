package godsak;

import godsak.GodSak;

public class PepperKaka extends GodSak {

    private String form;        // Privata instansvariabeln, används när en klass har något
    private boolean gradningsgrad;   // Privata instansvariabeln, används när en klass har något
    /* om instansvariablerna ska vara ordentligt inkapslad anropar vi metoden "Private".
    detta för att manipulera det egna datat. När det är private så kan inte andra klasser komma in och ändra data*/
public PepperKaka(){}

    public PepperKaka(String form, boolean gradningsgrad){
    this.form = form;
    this.gradningsgrad=gradningsgrad;
    }/* this.peekare är ett objekt som alltid finns, pekar alltid på det egna obejktet*/

    public String getForm(){
        return form; /* public instansmetoder härifrån ner*/
    }
    public boolean getgradningsgrad(){
        return gradningsgrad
                ;
    }
    /* men vi vill tillåta och ge möjligheten för andra att komma in och läsa av
    och ändra formen och grädningsgraden */
    /*Nu kan andra klasser anropa metoderna(get)eftersom de är public, och veta grädningsgraden.*/

        public void setForm(String f){
        form = f;
    }

    public void setGradningsgrad(boolean g){
        gradningsgrad = g;
    }

    /*public instansmetoder*/
    public void printMe(){
        System.out.println("form: "+form+ "gräddad"+ gradningsgrad);
    }


}

/* this pekaren, vad händer om de inparametrar vi tar emot i konstruktion har samma namn som våra instansvariabler.
i metoder har inparametrar förträdet och kommer före instansvariablerna, d¨anvävänder mman this pekare, ett objekt
som alltid pekar på en egen klass.*/
