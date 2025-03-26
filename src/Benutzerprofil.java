import utils.*;
public class Benutzerprofil implements ComparableContent<Benutzerprofil> {
    private String benutzername;
    private String passwort;

    public Benutzerprofil(String login, String pw){

    }
    public String getBenutzername() {
        return benutzername;
    }
    public boolean isGreater (Benutzerprofil pk){

        return pk.getBenutzername().compareTo(benutzername)<0;

    }
    public boolean isLess (Benutzerprofil pk){
        return pk.getBenutzername().compareTo(benutzername)>0;
    }
    public boolean isEqual (Benutzerprofil pk){
        return pk.getBenutzername().compareTo(benutzername)==0;
    }



}
