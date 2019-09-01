public class Artkartierer {
    String nachname;
    String vorname;

    public Artkartierer(String nachname, String vorname){
        this.nachname = nachname;
        this.vorname = vorname;
    }
    public String meinToString(){
        return nachname + " " + vorname;
    }
}
