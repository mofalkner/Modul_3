import java.time.LocalDate;

public class App
{
    public static void main(String[] args)
    {
        Filme filme = new Filme("Super Mario","Ein Film über Super Mario", LocalDate.of(2023,7,12),new Genre("Abenteuer"),new Urheber("Alessandro","Riml","Hallo GmbH"),"Moritz Falkner",90,true,false);
        eBooks eBook = new eBooks("Paluten Freedom","In diesem Buch geht es um den Freedoms Squad!",LocalDate.of(2020,3,15),new Genre("Abenteuer"),new Urheber("Paluten","Youtuber","Freedom Firma"),"Paluten","1232-5664",160,23);
        Medienbibliothek medienbibliothek = new Medienbibliothek();
        medienbibliothek.mediumHinzufügen(filme);
        medienbibliothek.mediumHinzufügen(eBook);
        medienbibliothek.durchlaufen();
        medienbibliothek.titelanzeigen("Paluten Freedom");
    }
}