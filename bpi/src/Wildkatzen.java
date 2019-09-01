public class Wildkatzen extends Tiere{
    int loecher;
    public Wildkatzen(Artkartierer artkartierer, String status, String spezies, int alter, int menge, int loecher){
        super(artkartierer, status, spezies, alter, menge);
    }
    public String meinToString(){
        return "Artkartierung von: " + artkartierer.nachname + "Status: " + status + " Typ: " + " Alter: "+ alter + " Menge: " + menge + " Mauselöcher"
                + loecher+ "\n";
    }
}
