import utils.*;

public class Benutzerverwaltung {

    private String benutzername;
    private String passwort;
    private BinarySearchTree<Benutzerprofil> benutzerBaum;
    public Benutzerverwaltung() {
        benutzerBaum = new BinarySearchTree();
    }

    public void neuenBenutzerAnlegen(String pBenutzername, String pPw) {
       benutzername = pBenutzername;
       passwort = pPw;

    }

    public void nutzerLoeschen(String pBenutzername, String pPw) {
        benutzername = pBenutzername;
        passwort = pPw;

    }

    public void profilVoranden(String pBenutzername) {
        benutzername = pBenutzername;


    }

}