

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
    assertequals(1, htl.anzhalstudents());
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
    assertequals(3, htl.anzahlstudents());
    assertequals(htl, max.getSchool());
    assertequals(htl, hanna.getSchool());
    assertequals(htl, susi.getSchool());
    htl.abmelden(susi);
    assertequals(2, htl.anzhalstudents());
    assertequals(htl, max.getSchool());
    assertequals(htl, hanna.getSchool());
    assertequals(null, susi.getSchool());
    
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
    assertequals(2, htl.anzahlstudents());
    assertequals(hak, max.getSchool());
    assertequals(htl, hanna.getSchool());
    assertequals(htl, susi.getSchool());
    hak.abmelden(susi);
    //fehler
    assertequals(2, htl.anzhalstudents());
    assertequals(1, hak.anzahlStudents());
    assertequals(htl, max.getSchool());
    assertequals(htl, hanna.getSchool());
    assertequals(htl, susi.getSchool());
    
}
}