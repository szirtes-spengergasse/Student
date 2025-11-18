

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchoolTest
{
    @Test
    public void testAbmeldenSessel0()
    {
        School htl;        
        Student max, susi, alex;
        
        htl = new School("HTL");
        max  = new Student("Max",  21, true);
        susi = new Student("Susi", 19, true);
        alex = new Student("Alex", 20, true);
        htl.aufnehmen(max);
        htl.aufnehmen(susi);
        htl.aufnehmen(alex);
        assertEquals(3, htl.anzahlStudent());
        assertEquals(htl, max.getSchool());
        assertEquals(htl, susi.getSchool());
        assertEquals(htl, alex.getSchool());
        htl.abmelden(max);
        assertEquals(2, htl.anzahlStudent());
        assertEquals(null, max.getSchool());
        assertEquals(htl, susi.getSchool());
        assertEquals(htl, alex.getSchool());
    }
    
    @Test
    public void testAbmeldenSessel1()
    {
        School htl;        
        Student max, susi, alex;
        
        htl = new School("HTL");
        max  = new Student("Max",  21, true);
        susi = new Student("Susi", 19, true);
        alex = new Student("Alex", 20, true);
        htl.aufnehmen(max);
        htl.aufnehmen(susi);
        htl.aufnehmen(alex);
        assertEquals(3, htl.anzahlStudent());
        assertEquals(htl, max.getSchool());
        assertEquals(htl, susi.getSchool());
        assertEquals(htl, alex.getSchool());
        htl.abmelden(susi);
        assertEquals(2, htl.anzahlStudent());
        assertEquals(htl, max.getSchool());
        assertEquals(null, susi.getSchool());
        assertEquals(htl, alex.getSchool());
    }

    @Test
    public void testAbmeldenSessel2()
    {
        School htl;        
        Student max, susi, alex;
        
        htl = new School("HTL");
        max  = new Student("Max",  21, true);
        susi = new Student("Susi", 19, true);
        alex = new Student("Alex", 20, true);
        htl.aufnehmen(max);
        htl.aufnehmen(susi);
        htl.aufnehmen(alex);
        assertEquals(3, htl.anzahlStudent());
        assertEquals(htl, max.getSchool());
        assertEquals(htl, susi.getSchool());
        assertEquals(htl, alex.getSchool());
        htl.abmelden(alex);
        assertEquals(2, htl.anzahlStudent());
        assertEquals(htl, max.getSchool());
        assertEquals(htl, susi.getSchool());
        assertEquals(null, alex.getSchool());
    }
    
    @Test
    public void testAbmeldenAndereSchule()
    {
        School htl, hak;
        Student max, susi, alex;
        
        htl = new School("HTL");
        hak = new School("HAK");
        max  = new Student("Max",  21, true);
        susi = new Student("Susi", 19, true);
        alex = new Student("Alex", 20, true);
        htl.aufnehmen(max);
        htl.aufnehmen(susi);
        htl.aufnehmen(alex);
        assertEquals(3, htl.anzahlStudent());
        assertEquals(htl, max.getSchool());
        assertEquals(htl, susi.getSchool());
        assertEquals(htl, alex.getSchool());
        hak.abmelden(alex);
        //Fehler
        assertEquals(3, htl.anzahlStudent());
        assertEquals(htl, max.getSchool());
        assertEquals(htl, susi.getSchool());
        assertEquals(htl, alex.getSchool());
    }
    
    @Test
    public void testAbmeldenNull()
    {
        School htl;        
        htl = new School("HTL");
        htl.abmelden(null);
        //Fehler
        assertEquals(0, htl.anzahlStudent());
    }
    
    @Test
    public void testAufnehmenHtlHak()
    {
        School htl, hak;
        Student max;
        
        htl = new School("HTL");
        hak = new School("HAK");
        max = new Student("Max", 21, true);
        htl.aufnehmen(max);
        assertEquals(1, htl.anzahlStudent());
        assertEquals(0, hak.anzahlStudent());
        assertEquals(htl, max.getSchool());
        hak.aufnehmen(max);
        //Fehler
        assertEquals(1, htl.anzahlStudent());
        assertEquals(0, hak.anzahlStudent());
        assertEquals(htl, max.getSchool());
    }
    
    @Test
    public void testAufnehmen2xHtl()
    {
        School htl;
        Student max;
        
        htl = new School("HTL");
        max = new Student("Max", 21, true);
        htl.aufnehmen(max);
        assertEquals(1, htl.anzahlStudent());
        assertEquals(htl, max.getSchool());
        htl.aufnehmen(max);
        //Fehler
        assertEquals(1, htl.anzahlStudent());
        assertEquals(htl, max.getSchool());
    }
    
    @Test
    public void testAufnehmenOK()
    {
        School htl;
        Student max, susi;
        
        htl = new School("HTL");
        max = new Student("Max", 21, true);
        susi = new Student("Susi", 19, false);
        htl.aufnehmen(max);
        assertEquals(1, htl.anzahlStudent());
        assertEquals(htl, max.getSchool());
        assertEquals(null, susi.getSchool());
        htl.aufnehmen(susi);
        assertEquals(2, htl.anzahlStudent());
        assertEquals(htl, max.getSchool());
        assertEquals(htl, susi.getSchool());
    }

    @Test
    public void testAufnehmenNull()
    {
        School htl;
        
        htl = new School("HTL");
        htl.aufnehmen(null);
        //Fehler
        assertEquals(0, htl.anzahlStudent());
    }
    
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

    @Test
    public void testtausch()
    {
        School htl = new School("HTl");
        School hlw = new School("HLW");
        School ahs = new School("AHS");
        Student max = new Student("max",29,true);
        Student lola = new Student("lola",25, false);
        Student hans = new Student("hans", 35, true);
        
        htl.aufnehmen(max);
        hlw.aufnehmen(lola);
        ahs.aufnehmen(hans);
        max.tauschen(lola);
        assertEquals(htl, lola.getSchool());
        assertEquals(hlw, max.getSchool());
        assertEquals(ahs, hans.getSchool());
    }
    
    @Test
    public void testtauschnull()
    {
        School htl = new School("HTl");
        School hlw = new School("HLW");
        School ahs = new School("AHS");
        //Student max = new Student("max",29,true);
        Student lola = new Student("lola",25, false);
        Student hans = new Student("hans", 35, true);
        
        //htl.aufnehmen(max);
        hlw.aufnehmen(lola);
        ahs.aufnehmen(hans);
        lola.tauschen(null);
        assertEquals(hlw, lola.getSchool());
        //assertEquals(hlw, max.getSchool());
        assertEquals(ahs, hans.getSchool());
    }
    
    @Test
    public void testtauschschoolnull()
    {
        School htl = new School("HTl");
        School hlw = new School("HLW");
        School ahs = new School("AHS");
        Student max = new Student("max",29,true);
        Student lola = new Student("lola",25, false);
        Student hans = new Student("hans", 35, true);
        
        //htl.aufnehmen(max);
        hlw.aufnehmen(lola);
        ahs.aufnehmen(hans);
        max.tauschen(lola);
        assertEquals(hlw, lola.getSchool());
        assertEquals(null, max.getSchool());
        assertEquals(ahs, hans.getSchool());
    }
    
    @Test
    public void testtauschschoolnull1()
    {
        School htl = new School("HTl");
        School hlw = new School("HLW");
        School ahs = new School("AHS");
        Student max = new Student("max",29,true);
        Student lola = new Student("lola",25, false);
        Student hans = new Student("hans", 35, true);
        
        htl.aufnehmen(max);
        //hlw.aufnehmen(lola);
        ahs.aufnehmen(hans);
        max.tauschen(lola);
        assertEquals(null, lola.getSchool());
        assertEquals(htl, max.getSchool());
        assertEquals(ahs, hans.getSchool());
    }
    
    @Test
    public void testtauschschoolident()
    {
        School htl = new School("HTl");
        School hlw = new School("HLW");
        School ahs = new School("AHS");
        Student max = new Student("max",29,true);
        Student lola = new Student("lola",25, false);
        Student hans = new Student("hans", 35, true);
        
        htl.aufnehmen(max);
        htl.aufnehmen(lola);
        ahs.aufnehmen(hans);
        max.tauschen(lola);
        assertEquals(htl, lola.getSchool());
        assertEquals(htl, max.getSchool());
        assertEquals(ahs, hans.getSchool());
    }
    
    
    
    
    
}