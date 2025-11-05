

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchoolTest
{
    @Test
    public void testLeer()
    {
        School htl;
        htl = new School("HTL");
        assertEquals (999, htl.jungsterStudent());
    }
    
    @Test
    public void test1()
    {
        School htl;
        Student max, susi, alex;
        
        htl = new School("HTL");
        max =  new Student("Max",  22);
        susi = new Student("Susi", 26);
        alex = new Student("Alex", 29);
        htl.aufnehmen(max);
        assertEquals (22, htl.jungsterStudent());
    }
    
    @Test
    public void test2()
    {
        School htl;
        Student max, susi, alex;
        
        htl = new School("HTL");
        max =  new Student("Max",  22);
        susi = new Student("Susi", 26);
        alex = new Student("Alex", 29);
        htl.aufnehmen(max);
        htl.aufnehmen(susi);
        assertEquals (22, htl.jungsterStudent());
    }
    
    @Test
    public void testPos0()
    {
        School htl;
        Student max, susi, alex;
        
        htl = new School("HTL");
        max =  new Student("Max",  22);
        susi = new Student("Susi", 26);
        alex = new Student("Alex", 29);
        htl.aufnehmen(max);
        htl.aufnehmen(susi);
        htl.aufnehmen(alex);
        assertEquals (22, htl.jungsterStudent());
    }
    
    @Test
    public void testPos1()
    {
        School htl;
        Student max, susi, alex;
        
        htl = new School("HTL");
        max =  new Student("Max",  22);
        susi = new Student("Susi", 20);
        alex = new Student("Alex", 29);
        htl.aufnehmen(max);
        htl.aufnehmen(susi);
        htl.aufnehmen(alex);
        assertEquals (20, htl.jungsterStudent());
    }
    
    @Test
    public void testPos2()
    {
        School htl;
        Student max, susi, alex;
        
        htl = new School("HTL");
        max =  new Student("Max",  22);
        susi = new Student("Susi", 26);
        alex = new Student("Alex", 19);
        htl.aufnehmen(max);
        htl.aufnehmen(susi);
        htl.aufnehmen(alex);
        assertEquals (19, htl.jungsterStudent());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Test
    public void testPos2Ref()
    {
        School htl;
        Student max, susi, alex;
        
        htl = new School("HTL");
        max =  new Student("Max",  22);
        susi = new Student("Susi", 26);
        alex = new Student("Alex", 19);
        htl.aufnehmen(max);
        htl.aufnehmen(susi);
        htl.aufnehmen(alex);
        assertEquals (alex, htl.jungsterStudent2());
    }

}