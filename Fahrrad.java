public class Fahrrad
{
     private int anzahlGange;
    
    public Fahrrad(int newGange)
    {
    setanzahlGange(newGange);
    }
    
    public Fahrrad()
    {
    setanzahlGange(21);
    }
    
    public int getanzahlGange()
    {
    return anzahlGange;
    }
    
    public void setanzahlGange( int newGange)
    {
    anzahlGange = newGange;
    }
    
    public void printFahrrad()
    {
    System.out.println(anzahlGange + " Gaenge");
    }
}
