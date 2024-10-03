import java.time.LocalDate;
import java.util.Date;

public class eBooks extends Medium {
    private String Autor;
    private String ISBN;
    private int Seitenanzahl;
    private int Auflage;

    public eBooks(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre, Urheber urheber, String autor, String ISBN, int seitenanzahl, int auflage) {
        super(titel, kommentar, erscheinungsdatum, genre, urheber);
        Autor = autor;
        this.ISBN = ISBN;
        Seitenanzahl = seitenanzahl;
        Auflage = auflage;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAuflage() {
        return Auflage;
    }

    public void setAuflage(int auflage) {
        Auflage = auflage;
    }

    public int getSeitenanzahl() {
        return Seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        Seitenanzahl = seitenanzahl;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public void anzeigen()
    {
        super.anzeigen();
        System.out.println("Autor -> " + getAutor() + " | ISBN -> " + getISBN() + " | Seitenanzahl -> " + getSeitenanzahl() + " | Auflage -> " + getAuflage());
    }
}