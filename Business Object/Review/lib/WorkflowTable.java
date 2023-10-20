package lib;

public class WorkflowTable {
    
    /**
     * Attributes associated with this class.
     */
    private int workflowID;
    private String currentStep;

    /**
     * Making a default value here.
     */
    public WorkflowTable() {
        
        this.currentStep = "Current step";
    
    }

    /**
     * Getting the current step.
     * @return currentStep as output.
     */
    public String getCurrentStep() {
        
        return (currentStep);

    }

    /**
     * Making another default value here.
     */
    public void loadNextItem() {
        
        this.currentStep = "Loading next item now";
    }

    /**
     * Updating step to parameter.
     * @param step for input.
     */
    public void updateStep(String step) {
        
        this.currentStep = step;
    
    }

}

