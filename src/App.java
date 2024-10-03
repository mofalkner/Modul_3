import java.time.LocalDate;

public class App
{
    public static void main(String[] args)
    {
        Filme filme = new Filme("Super Mario","Ein Film über Super Mario", LocalDate.of(2023,7,12),new Genre("Abenteuer"),new Urheber("Alessandro","Riml","Hallo GmbH"),"Moritz Falkner",90,true,false);
        filme.anzeigen();
    }
}