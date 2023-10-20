package lib;

public class WorkflowTable {
    
    /**
     * Attributes associated with WorkflowTable.
     */
    private int workflowID;
    private String currentStep;

    /**
     * Default value just for testing purposes.
     */
    public WorkflowTable() {
        
        this.currentStep = "Current Step";  
    
    }

    /**
     * Getter method for testing purposes.
     * @return currentStep as output.
     */
    public String getCurrentStep() {
        
        return (currentStep);
    
    }

    /**
     * Loading next step for workflow table.
     * Default value to fail testing.
     */
    public void loadNextItem() {

        this.currentStep = "Current Step xyz";  

    }

    /**
     * Updating step to parameter. 
     * Testing for null and empty checks.
     * @param step for input.
     */
    public void updateStep(String step) {
        
        if (step == null || step.isEmpty()) {
            
            throw new IllegalArgumentException("Updated Step cannot be null or empty!");
        
        }
        
        this.currentStep = step;
    
    }

}
