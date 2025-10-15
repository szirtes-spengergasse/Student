

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Test2
{  
    @Test
    public void testalex()
    {
        StudentInDerSpengergasse alex; //legt einne neue identität in der class an
        alex = new StudentInDerSpengergasse("alex", 13, false); //mit diesen eigenschaftaen
        alex.printStudentInDerSpengergasse(); //ruft die MEthode von der class StudentInDerSpengergasse auf
        assertEquals(14, alex.getAlter());
    }
   
    @Test
    public void testsusi()
    {
        StudentInDerSpengergasse susi;
        susi = new StudentInDerSpengergasse("susi", 25, false);
        susi.printStudentInDerSpengergasse();
        assertEquals(25, susi.getAlter());
    }

    @Test
    public void testmax()
    {
        StudentInDerSpengergasse max;
        max = new StudentInDerSpengergasse("max", 66, true);
        max.printStudentInDerSpengergasse();
        assertEquals(14, max.getAlter());
    }
}