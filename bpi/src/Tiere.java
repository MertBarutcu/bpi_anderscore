public abstract class Tiere {
    Artkartierer artkartierer;
    String status;
    String spezies;
    int alter;
    int menge;

    public Tiere(Artkartierer artkartierer, String status, String spezies, int alter, int menge){
        this.artkartierer = artkartierer;
        this.status = status;
        this.spezies = spezies;
        this.alter = alter;
        this.menge = menge;
    }
    public String meinToString(){
        return "Artkartierung von: " + artkartierer + "Status: " +status+ "Typ: " + "Alter: "+ alter+ "Menge: " + menge + "\n" ;
    }
}
