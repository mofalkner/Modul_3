import java.time.LocalDate;
import java.util.Date;

public class Medium
{
    private String Titel;
    private String Kommentar;
    private LocalDate Erscheinungsdatum;
    private Genre Genre;
    private Urheber Urheber;

    public Medium(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre, Urheber urheber) {
        Titel = titel;
        Kommentar = kommentar;
        Erscheinungsdatum = erscheinungsdatum;
        Genre = genre;
        Urheber = urheber;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public Genre getGenre() {
        return Genre;
    }

    public void setGenre(Genre genre) {
        Genre = genre;
    }

    public LocalDate getErscheinungsdatum() {
        return Erscheinungsdatum;
    }

    public void setErscheinungsdatum(LocalDate erscheinungsdatum) {
        Erscheinungsdatum = erscheinungsdatum;
    }

    public String getKommentar() {
        return Kommentar;
    }

    public void setKommentar(String kommentar) {
        Kommentar = kommentar;
    }

    public Urheber getUrheber() {
        return Urheber;
    }

    public void setUrheber(Urheber urheber) {
        Urheber = urheber;
    }

    public void anzeigen()
    {
         System.out.println("Titel -> " + getTitel() + " | Kommentar -> " + getKommentar() + " | Erscheinungsdatum -> " + getErscheinungsdatum() + " | Genre -> " + getGenre() + " | Urheber -> " + getUrheber());
    }
}