import org.junit.Test;
import static org.junit.Assert.*;

public class WorkflowTableTest {

    /**
     * Testing getCurrentStep().
     * Should fail since "Current step" != "Done!".
     */
    @Test
    public void testInitialStep() {
        
        WorkflowTable workflow = new WorkflowTable();
        
        assertEquals("Done!", workflow.getCurrentStep());  
    
    }

    /**
     * Testing loadNextItem(). 
     * Should fail since "Loading next item now" != "Loading the first item now".
     */
    @Test
    public void testLoadNextItem() {
        
        WorkflowTable workflow = new WorkflowTable();
        
        workflow.loadNextItem();
        
        assertEquals("Loading the first item now", workflow.getCurrentStep());  
    
    }

    /**
     * Testing updateStep().
     * Should fail since "Step is updated" != "Updated the step".
     */
    @Test
    public void testUpdateStep() {
        
        WorkflowTable workflow = new WorkflowTable();
        
        workflow.updateStep("Step is updated");
        
        assertEquals("Updated the step", workflow.getCurrentStep());  
    
    }

}

