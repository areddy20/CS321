package lib;
import java.util.ArrayList;
import java.util.List;

public class GenealogyRequestReview {
    
    /**
     * Attributes mentioned in my class diagram.
     */

    private int reviewerID;
    
    private String reviewComments;
    
    private String reviewStatus;
    
    /**
     * Classes where the review stage is calling 
     * these classes' methods to retrieve data
     */

    private Form form;
    
    private WorkflowTable workflowTable;
    
    /**
     * Made for having its tester method to print something
     */

    private List<String> reviewHistoryLog = new ArrayList<>();

    /**
     * This is for null and empty checks
     * @param reviewerID 
     * @param reviewComments
     * @param reviewStatus
     * @param form
     * @param workflowTable
     */

    public GenealogyRequestReview(int reviewerID, String reviewComments, String reviewStatus, Form form, WorkflowTable workflowTable) {
    
        if (form == null) {
        
            throw new IllegalArgumentException("Form cannot be null");
    
        }
    
        if (workflowTable == null) {
        
            throw new IllegalArgumentException("WorkflowTable cannot be null");
    
        }

        /**
         * Initializing attributes and other classes' needed for this class attributes
         */

        this.reviewerID = reviewerID;
        
        this.reviewComments = reviewComments;
        
        this.reviewStatus = reviewStatus;
        
        this.form = form;
        
        this.workflowTable = workflowTable;

}

    /**
     * Getter for testing purposes.
     * @return reviewStatus as output.
     */
    public String getReviewStatus() {
        
        return (reviewStatus);
    
    }

    /**
     * Getter for testing purposes.
     * @return form as output.
     */
    public Form getForm() {
        
        return (form);
    
    }

    /**
     * Getter for testing purposes.
     * @return workflowtable as output.
     */
    public WorkflowTable getWorkflowTable() {
        
        return (workflowTable);

    }

    /**
     * Starting the review and marking it as "Pending". 
     * Adds the string to the history log for the reviewer.
     */
    public void startReview() {
        
        reviewStatus = "Pending";
        
        reviewHistoryLog.add("Review started by reviewer with ID: " + reviewerID);
    
    }

    /**
     * Loading next item from the workflow table.
     * Adds the string to the history log for the reviewer.
     */
    public void loadNextReviewItem() {
        
        workflowTable.loadNextItem();
        
        reviewHistoryLog.add("Loaded next review item.");
    
    }

    /**
     * Supplemental checks are being performed now.
     * Adds the string to the history log for the reviewer.
     */
    public void performSupplementalChecks() {
        
        reviewHistoryLog.add("Supplemental checks performed.");
    
    }

    /**
     * Editing data if needed.
     * Adds the string to the history log for the reviewer.
     * @param updatedForm for input.
     */
    public void editData(Form updatedForm) {
        
        this.form = updatedForm;
        
        reviewHistoryLog.add("Data edited by reviewer with ID: " + reviewerID);
    
    }

    /**
     * Validating data by checking validity.
     * Adds the string to the history log for the reviewer.
     * @return value of isValid for output.
     */
    public boolean validateData() {
        
        boolean isValid = true; 
        
        reviewHistoryLog.add("Data validation performed. Result: " + (isValid ? "Valid" : "Invalid"));
        
        return (isValid);

    }

    /**
     * If data needs corrections, so status of it is being returned back for editing.
     * Adds the string to the history log for the reviewer.
     */
    public void needCorrections() {
        
        reviewStatus = "Returned";
        
        reviewHistoryLog.add("Item returned for corrections.");
    
    }

    /**
     * Last step in review process.
     * After all criteria is met, status is marked as "Reviewed".
     * Adds the string to the history log for the reviewer.
     */
    public void finalizeReview() {
        
        reviewStatus = "Reviewed";
        
        if (workflowTable != null) {
            
            workflowTable.updateStep("Review Completed");
        
        }
        
        reviewHistoryLog.add("Review finalized by reviewer with ID: " + reviewerID);
    }

    /**
     * Adds all actions of the reviewer to their log.
     * @param action for input.
     */
    public void reviewHistory(String action) {
        
        reviewHistoryLog.add(action);
    
    }

}
