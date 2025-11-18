public class Student
{
    private String  name;
    private int     alter;
    private boolean matura;
    private School  school;

    public Student(String name, int alter, boolean matura)
    {
        setName (name);
        setAlter (alter);
        setMatura (matura);
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

    public School getSchool()
    {
        return school;
    }

    public void setName(String name)
    {
        // Eigenschaft this.name
        // Parameter   name
        this.name = name;
    }

    public void setAlter(int alter)
    {
        if ((alter >= 14) && (alter < 65))
        {
            this.alter = alter;
        }
        else
        {
            System.out.println("Fehler: das Alter muss zwischen 14 und 65 sein!");
            this.alter = 14;
        }
    }

    public void setMatura(boolean matura)
    {
        this.matura = matura;
    }

    public void setSchool(School school)
    {
        this.school = school;
    }

    public String getNachname()
    {
        int pos;

        pos = name.indexOf(" ");
        return name.substring(pos+1);
    }

    public String getVorname()
    {
        int pos;

        pos = name.indexOf(" ");
        return name.substring(0, pos);
    }

    public String getNachnameVorname()
    {
        return getNachname() + " " + getVorname();
    }

    // GRIE52
    // HANS22
    public String getAccount()
    {
        String nachname, nachname4;                    // 0123456789
        nachname = getNachname();                      // Griesmayer
        nachname4 = nachname.substring(0,4);           // Grie
        return nachname4.toUpperCase() + alter;        // GRIE52
    }

    public void tauschen(Student wer)
    {
        if (wer != null)
        {
            if (this.getSchool() != null)
            {
                if (wer.getSchool() != null)
                {
                    if (this.getSchool() != wer.getSchool())
                    {
                        School thisSchool = this.getSchool();
                        School werSchool = wer.getSchool();
                        thisSchool.abmelden(this);
                        werSchool.abmelden(wer);
                        thisSchool.aufnehmen(wer);
                        werSchool.aufnehmen(this);
                    }
                    else
                    {
                        System.out.println("Fehler: gleiche Schule!");                            
                    }
                }
                else
                {
                    System.out.println("Fehler: " + wer.getName() + " ohne Schule");        
                }
            }
            else
            {
                System.out.println("Fehler: " + this.getName() + " ohne Schule");    
            }
        }
        else
        {
            System.out.println("Fehler: kein Student!");
        }
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
            System.out.println(name + " - " + alter + " Jahre: " + " hat Matura");
        }
        else
        {
            System.out.println(name + " - " + alter + " Jahre: " + " hat keine Matura");
        }
    }
}









