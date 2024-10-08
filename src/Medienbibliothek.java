import java.util.ArrayList;

public class Medienbibliothek
{
    private ArrayList<Medium> medien = new ArrayList();

    public void mediumHinzufügen(Medium medium)
    {
        this.medien.add(medium);
    }

    public void durchlaufen()
    {
        for (Medium medium : medien)
        {
            medium.anzeigen();
        }
    }

    public void titelanzeigen(String titel)
    {
        for (Medium medium : medien)
        {
            if (medium.getTitel().equals(titel))
            {
                medium.anzeigen();
            }
        }
    }
}