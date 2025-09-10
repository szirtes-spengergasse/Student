/*  - steht für private
    + steht für methoden*/



public class StudentInDerSpengergasse
{ 
    private String  name;
    private int     alter;
    private boolean matura;
    
    /*konstruktor--> gibt eine objektreferenz zurück*/
    public StudentInDerSpengergasse(String newName, int newAlter, boolean newMatura)
    {
        setName(newName);
        setAlter(newAlter);
        setMatura(newMatura);
    
    }
    
    public StudentInDerSpengergasse()
    {
        setName("UNKN");
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
    
    public boolean getMatura()
    {
        return matura;
    }
    /*setMethode*/
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setAlter(int newAlter)
    {
        alter = newAlter;
    }
    
    public void setMatura(boolean newMatura)
    {
        matura = newMatura;
    }
}    
