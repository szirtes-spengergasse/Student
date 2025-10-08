/*
- steht für private
+ steht für methoden
*/


/*Instanze*/
public class StudentInDerSpengergasse
{ 
    //Eigenschaft
    private String  name;
    private int     alter;
    private boolean matura;
    
    /*Constructor--> gibt eine objektreferenz zurück*/
    public StudentInDerSpengergasse(String name, int alter, boolean matura)
    {
        machName(name);
        setAlter(alter);
        setMatura(matura);
    
    }
    
    public StudentInDerSpengergasse()
    {
        machName("UNKN");
        setAlter(14);
        setMatura(false);
    }
    /*getMethoden*/
    public String getName()
    {
        return name;
    }
     
    public int getAlter()
    {
       /* if (alter>20)
        {
            return 1200230200;
        }
        else
        {*/
        return alter;
        /*}*/
    }
    
    public boolean gibMatura()/*get wird nur dadurch definiert, was in der Methode passiert, nicht einem befehl wie: get...*/
    {
        return matura;
    }
    /*setMethode*/
    public void machName(String name)/*set wird nur dadurch definiert, was in der Methode passiert, nicht einem befehl wie: set...*/
    {
        //Eigenschaft   this.name
        //Parameter     name
        this.name = name;
    }
    
    public void setAlter(int alter)
    {
        if ((alter>= 14) && (alter<=65))
        {
            this.alter = alter;
        }
        else
        {
            System.out.println("Fehler: Das alter muss zwischen 14 und 65 Jahren liegen!!");
            this.alter = 14;
        }
    }
    
    public void setMatura(boolean matura)
    {
        this.matura = matura;
    }
    //print Methode
    public void printStudentInDerSpengergasse()
    {
        if (matura == true)
        {
            System.out.println(name + " - " + alter + " Jahre: " + "hat matura"); 
        }
        
        else
        {
            System.out.println(name + " - " + alter + " Jahre: " + "hat keine matura");   
        }
    }
}    
