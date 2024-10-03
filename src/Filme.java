import java.time.LocalDate;
import java.util.Date;

public class Filme extends Medium
{
    private String Regisseur;
    private int Spielzeit;
    private boolean UHD;
    private boolean HD;

    public Filme(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre, Urheber urheber, String regisseur, int spielzeit, boolean UHD, boolean HD) {
        super(titel, kommentar, erscheinungsdatum, genre, urheber);
        Regisseur = regisseur;
        Spielzeit = spielzeit;
        this.UHD = UHD;
        this.HD = HD;
    }

    public String getRegisseur() {
        return Regisseur;
    }

    public void setRegisseur(String regisseur) {
        Regisseur = regisseur;
    }

    public boolean isHD() {
        return HD;
    }

    public void setHD(boolean HD) {
        this.HD = HD;
    }

    public boolean isUHD() {
        return UHD;
    }

    public void setUHD(boolean UHD) {
        this.UHD = UHD;
    }

    public int getSpielzeit() {
        return Spielzeit;
    }

    public void setSpielzeit(int spielzeit) {
        Spielzeit = spielzeit;
    }

    @Override
    public void anzeigen()
    {
        super.anzeigen();
        System.out.println("Regisseur -> " + getRegisseur() + " | Spielzeit -> " + getSpielzeit() + " | UHD -> " + isUHD() + " | HD -> " + isHD());
    }
}