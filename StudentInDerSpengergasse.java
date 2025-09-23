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
        return alter;
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
        this.alter = alter;
    }
    
    public void setMatura(boolean matura)
    {
        this.matura = matura;
    }
    //print Methode
    public void printStudent()
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
