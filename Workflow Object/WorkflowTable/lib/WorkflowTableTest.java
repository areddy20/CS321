package lib;
import org.junit.Test;
import static org.junit.Assert.*;

public class WorkflowTableTest {

    /**
     * Testing loadNextItem().
     * Should work since initialStep != updatedStep.
     */
    @Test
    public void testLoadNextItem() {
        
        WorkflowTable workflow = new WorkflowTable();
        
        String initialStep = workflow.getCurrentStep();
        
        workflow.loadNextItem();
        
        String updatedStep = workflow.getCurrentStep();
        
        assertNotEquals(initialStep, updatedStep);
    }

    /**
     * Testing updateStep().
     */
    @Test
    public void testUpdateStep() {
        
        WorkflowTable workflow = new WorkflowTable();
        
        String newStep = "Review Completed";
        
        workflow.updateStep(newStep);
        
        assertEquals(newStep, workflow.getCurrentStep());
    }

    /**
     * Testing updateStep for null checks.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateStepWithNull() {
        
        WorkflowTable workflow = new WorkflowTable();
        
        workflow.updateStep(null);
    
    }

    /**
     * Testing updateStep for empty checks.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateStepWithEmptyString() {
        
        WorkflowTable workflow = new WorkflowTable();
        
        workflow.updateStep("");
    
    }

}

