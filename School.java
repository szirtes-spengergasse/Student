public class School
{
    private String name;
    private Student student0;
    private Student student1;
    private Student student2;
    
    public School(String name)
    {
        setName(name);
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void aufnehmen(Student wer)
    {
        if (student0 == null)
        {
            student0 = wer;
        }
        else
        {
            if (student1 == null)
            {
                student1 = wer;
            }
            else
            {
                if (student2 == null)
                {
                    student2 = wer;
                }
                else
                {
                    System.out.println("Fehler: kein Platz!");
                }
            }
        }
    }

    public Student jungsterStudent2()
    {
        int min;
        Student minStudent;
        
        min = 999;
        minStudent = null;
        if (student0 != null)
        {
            if (student0.getAlter() < min)
            {
                min = student0.getAlter();
                minStudent = student0;
            }
        }
        if (student1 != null)
        {
            if (student1.getAlter() < min)
            {
                min = student1.getAlter();
                minStudent = student1;
            }
        }
        if (student2 != null)
        {
            if (student2.getAlter() < min)
            {
                min = student2.getAlter();
                minStudent = student2;
            }
        }
        return minStudent;
    }

    
    public int jungsterStudent()
    {
        int min;
        
        min = 999;
        if (student0 != null)
        {
            if (student0.getAlter() < min)
            {
                min = student0.getAlter();
            }
        }
        if (student1 != null)
        {
            if (student1.getAlter() < min)
            {
                min = student1.getAlter();
            }
        }
        if (student2 != null)
        {
            if (student2.getAlter() < min)
            {
                min = student2.getAlter();
            }
        }
        if (min == 999)
        {
            System.out.println("Fehler: kein Student!");
        }
        return min;
    }
    
    public void printSchool()
    {
        System.out.println(name);
        if (student0 != null)
        {
            student0.printStudent();
        }
        if (student1 != null)
        {
            student1.printStudent();
        }
        if (student2 != null)
        {
            student2.printStudent();
        }
    }
}








