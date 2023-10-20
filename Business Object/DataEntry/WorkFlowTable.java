public class WorkFlowTable {
    private int workflowID;
    private int currentStep;

    public WorkFlowTable(int workflowID, int currentStep){
        this.workflowID=workflowID;
        this.currentStep=currentStep;
    }
    public int getWorkFlowID(){
        return workflowID;
    }
    public int getCurrentStep(){
        return currentStep;
    } 
}
