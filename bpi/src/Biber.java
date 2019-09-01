public class Biber extends Tiere{
    int wasser;
    public Biber(Artkartierer artkartierer, String status, String spezies, int alter, int menge, int wasser){
        super(artkartierer, status, spezies, alter, menge);
    }
    public String meinToString(){
        return "Artkartierung von: " + artkartierer.nachname + " " +" Status: " +status+ " Typ: " + " Alter: "+ alter+ " Menge: " + menge + " Wasserqualität " + wasser +
                "\n";
    }
}
