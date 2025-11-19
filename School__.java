

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class School__
{
    
@Test
public void abmeldennull()
{
    School htl;
    Student max;
    
    htl = new School("HTl");
    max = new Student("Max", 29, true);
    htl.aufnehmen(max);
    htl.abmelden(null);
    //Fehler
    assertEquals(1, htl.anzahlStudent());
}

@Test
public void abmeldenSt2()
{
    School htl;
    Student max, susi, hanna;
    
    htl = new School("HTl");
    max = new Student("Max", 29, true);
    hanna = new Student("Hanna", 19, false);
    susi = new Student("Susi", 40, true);
    htl.aufnehmen(max);
    htl.aufnehmen(hanna);
    htl.aufnehmen(susi);
    assertEquals(3, htl.anzahlStudent());
    assertEquals(htl, max.getSchool());
    assertEquals(htl, hanna.getSchool());
    assertEquals(htl, susi.getSchool());
    htl.abmelden(susi);
    assertEquals(2, htl.anzahlStudent());
    assertEquals(htl, max.getSchool());
    assertEquals(htl, hanna.getSchool());
    assertEquals(null, susi.getSchool());
    
}

@Test
public void falschaschule()
{
    School htl, hak;
    Student max, susi, hanna;
    
    htl = new School("HTl");
    hak = new School("HAK");
    max = new Student("Max", 29, true);
    hanna = new Student("Hanna", 19, false);
    susi = new Student("Susi", 40, true);
    hak.aufnehmen(max);
    htl.aufnehmen(hanna);
    htl.aufnehmen(susi);
    assertEquals(2, htl.anzahlStudent());
    assertEquals(hak, max.getSchool());
    assertEquals(htl, hanna.getSchool());
    assertEquals(htl, susi.getSchool());
    hak.abmelden(susi);
    //fehler
    assertEquals(2, htl.anzahlStudent());
    assertEquals(1, hak.anzahlStudent());
    assertEquals(htl, max.getSchool());
    assertEquals(htl, hanna.getSchool());
    assertEquals(htl, susi.getSchool());
    
}
}