import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class WFstep1Test {
    Citizen test1 = new Citizen(01, "John Doe", "jdoe@gmail.com");
    int nameLength = test1.getName().length();
    int emailLength = test1.getEmail().length();

    @Test
    public void testCitizen0() {
        assertEquals(null, test1.getCitizenID());
    }

    @Test
    public void testCitizen1() {
        assertEquals(null, test1.getName());
    }

    @Test
    public void testCitizen2() {
        assertEquals(null, test1.getEmail());
    }
    Immigrant test2 = new Immigrant(55, "Jane Doe", 1954);
    int nameLength2 = test2.getName().length();
    @Test
    public void testImmigrant1() {
        assertEquals(null, test2.getImmigrantID());
    }
    @Test
    public void testImmigrant2() {
        assertEquals(null, test2.getName());
    }
    @Test
    public void testImmigrant3() {
        assertEquals(null, test2.getDateOfDeath());
    }
    Form f1 = new Form(17, "Foo", "Bar");
    Form f2 = new Form(65, "Boo", "Far");
    List<Form> fl1 = new ArrayList<Form>();
    GenealogyRequest test3 = new GenealogyRequest(776, new Citizen(1, "John", "j123@gmail.com"), fl1, "New");
    int statusLength = test3.getStatus().length();
    @Test
    public void testGenealogyRequest1() {
        assertEquals(null, test3.getrequestID());
    }
    @Test
    public void testGenealogyRequest2() {
        assertEquals(null, test3.getRequester());
    }
    @Test
    public void testGenealogyRequest3() {
        fl1.add(f1);
        fl1.add(f2);
        assertEquals(null, test3.getForms());
    }
    @Test
    public void testGenealogyRequest4() {
        assertEquals(null, test3.getStatus());
    }
    @Test
    public void testGenealogyRequest5() { 
        assertTrue(test3.getRequester().equals(null));
    }
    }
