import org.junit.Test;
import static org.junit.Assert.*;

public class FormTest {

    /**
     * Tester for formName().
     * Should fail since "Sample Form" != Form.
     */
    @Test
    public void testFormName() {
        
        Form form = new Form(1, "Sample Form", "Description");
        
        assertEquals("Form", form.getFormName());  
    
    }

    /**
     * Tester for formDescription().
     * Should fail since "Description" != "Discription".
     */
    @Test
    public void testFormDescription() {
        
        Form form = new Form(1, "Sample Form", "Description");
        
        assertEquals("Discription", form.getFormDescription());  
    
    }

    /**
     * Tester for formID().
     * Should fail since "1" != "11".
     */
    @Test
    public void testFormID() {
        
        Form form = new Form(1, "Sample Form", "Description");
        
        assertEquals(11, form.getFormID());  
    
    }

}
