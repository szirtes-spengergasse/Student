public class Student
{
    private String  name;
    private int     alter;
    private boolean matura;
   
    public Student(String name, int alter, boolean matura)
    {
        setName(name);
        setAlter(alter);
        setMatura(matura);
    }
   
    public Student(String name, int alter)
    {
        setName(name);
        setAlter(alter);
        setMatura(false);
    }

    public Student(String name, boolean matura)
    {
        setName(name);
        setAlter(14);
        setMatura(matura);
    }

    public Student()
    {
        setName("UNKN");
        setAlter(14);
        setMatura(false);
    }
    
    public String getvorname()
    {
        int pos;
        pos = name.indexOf(" ");
        return name.substring(0, pos);
    }
    
    public String getnachname()
    {
        int pos;
        
        pos = name.indexOf(" ");
        return name.substring(pos + 1, name.length());
    }
    public String getaccount()
    {
        String name1, name3;                        // setzt zwei Variablen mit dem Datentypen STRING
        name1 = getvorname().substring(0, 3);       // variable1 = funktionswert.teil(von, bis)          
        name3 = name1.toUpperCase();                // variable2 = variable1.in caps()
        return name3 + alter;                       // return variable2 + alter
    }
    
    public String getvollname()
    {
        return getvorname() + " " + getnachname();  // benutzt funktionen und setzt diese(ergebnisse) zusammen
    }
    public String getName()
    {
        //return this.name;
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
   
    public void setName(String name)
    {
        // Eigenschaft this.name
        // Parameter   name
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

    public String getVorname()
    {
        int pos;
       
        pos = name.indexOf(" ");        // pos = 6
        return name.substring(0, pos);  // "Thomas"
    }
   
    /*
       Print Methode
       name - alter Jahre: hat Matura
       Max - 29 Jahre: hat Matura
       Susi - 22 Jahre: hat keine Matura
       Werner - 21 Jahre: hat Matura
    */
    public void printStudent()
    {
        if (matura == true)
        {
            System.out.println(name + " - " + alter + " Jahre: " + "hat Matura");
        }
        else
        {
            System.out.println(name + " - " + alter + " Jahre: " + "hat keine Matura");
        }
    }
}











