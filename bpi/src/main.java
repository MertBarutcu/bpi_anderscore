import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    static boolean anmeldung = false ;
    static String vorname;
    static String nachname;
    static Artkartierer tmp;
    static List<Artkartierer> ArtkartiererListe = new ArrayList<Artkartierer>();
    static List<Tiere> tierListe = new ArrayList<Tiere>();


    public static void main(String[] args) {
        anmelden();
    }

    public static void anmelden(){
        Scanner input = new Scanner(System.in);
        if (anmeldung){
            auswahl();
        }else {
            System.out.println("Bitte melden Sie sich an: ");
            System.out.println("Vorname: ");
            vorname = input.next();
            System.out.println("Nachname: ");
            nachname = input.next();
            tmp = new Artkartierer(vorname, nachname);
            ArtkartiererListe.add(tmp);
            anmeldung = true;
            System.out.println("Sie sind nun angemeldet! ");
            abtrennung();
            auswahl();
        }
    }

    public static void auswahl(){

        System.out.println("Sie können einen der folgenden Punkte auswaehlen: ");
        System.out.println("(1) Tier kartieren  \n(2) Kartierte Tiere ausgeben \n(3) Kartierer ausgeben \n(4) User abmelden \n(5) Programm beenden ");
        Scanner in = new Scanner(System.in);
        int eingabe = in.nextInt();

        switch (eingabe){
            case 1:
                abtrennung();
                kartieren();
                break;
            case 2:
                abtrennung();
                if (tierListe.isEmpty()) System.out.println("Es tut uns leid, aber es wurden noch keine Tiere kartiert! ");
                for (int i = 0;i<tierListe.size();i++){ System.out.println(tierListe.get(i).meinToString()); }
                auswahl();
                break;
            case 3:
                abtrennung();
                if (ArtkartiererListe.isEmpty()) System.out.println("Aktuell sind keine Kartierer eingetragen ");
                for (int i = 0;i<ArtkartiererListe.size();i++) { System.out.println(ArtkartiererListe.get(i).meinToString()); }
                auswahl();
                break;
            case 4:
                abtrennung();
                System.out.println( vorname + " " + nachname + " wurde abgemeldet. ");
                anmeldung= false;
                anmelden();
                break;
            case 5:
                abtrennung();
                System.out.println("Nachdem Beenden des Programmes werden alle Objekte gelöscht! Sind Sie sich sicher? 1=ja 2=Nein");
                int jaNein = in.nextInt();
                if (jaNein==1) {
                    System.out.println("Das Programm wurde beendet!");
                    System.exit(0);
                }else {
                    System.out.println("Der Vorgang wurde abgebrochen, Sie werden zum Hauptmanue weitergeleitet");
                    abtrennung();
                    auswahl();
                }
                break;
            default:
                System.out.println("Sie haben eine ungültige Eingabe getätigt!");
                auswahl();
        }
    }

    public static void kartieren(){
        abtrennung();
        System.out.println("Welches Tier soll Kartiert werden: ");
        System.out.println("(1) Wildkatze  \n(2) Biber \n(3) Zurück ");

        Scanner in = new Scanner(System.in);
        int zahl = in.nextInt();
        switch(zahl){
            case 1:
                System.out.println("Wildkatze: \n Anzahl: ");
                int anzahl = in.nextInt();
                System.out.println("Spezies: ");
                String spezies = in.next();
                System.out.println("Status: ");
                String status = in.next();
                System.out.println("Alter: ");
                int alter = in.nextInt();
                System.out.println("Anzahl entdeckter Mauselöcher: ");
                int menge = in.nextInt();
                tierListe.add(new Wildkatzen(tmp, status,spezies,alter,anzahl,menge));
                System.out.println("Wildkatze/n kartiert. ");
                abtrennung();
                kartieren();
                break;

            case 2:
                System.out.println("Biber: \n Anzahl: ");
                int anzahl2 = in.nextInt();
                System.out.println("Status: ");
                String status2 = in.next();
                System.out.println("Art: ");
                String spezies2 = in.next();
                System.out.println("Alter: ");
                int alter2 = in.nextInt();
                System.out.println("Wasserqualität von 1(Sehr Schlecht) bis 10(Sehr gut): ");
                int wasser = in.nextInt();
                tierListe.add(new Biber(tmp, status2,spezies2,alter2,anzahl2,wasser));
                System.out.println("Biber erfolgreich kartiert. ");
                abtrennung();
                kartieren();
                break;

            case 3:
                abtrennung();
                auswahl();
                break;
            default:
                System.out.println("Bitte überprüfen Sie ihre Eingabe.");
        }
    }

    public static void abtrennung(){
        System.out.println("--------------------------------------------------------------");
    }
}
