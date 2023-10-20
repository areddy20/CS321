package lib;

import org.junit.Test;
import static org.junit.Assert.*;

public class GenealogyRequestReviewTest {

    /**
     * Testing all methods in the GenealogyRequestReview class.
     * Form and WorkflowTable contents are also called due to their use in the GenealogyRequestReview class.
     * Last few methods are meant for null and empty checking.
     */

    @Test
    public void testStartReview() {
        
        GenealogyRequestReview review = createReviewInstance();
        
        review.startReview();
        
        assertEquals("Pending", review.getReviewStatus());
    
    }

    @Test
    public void testLoadNextReviewItem() {
    
        GenealogyRequestReview review = createReviewInstance();
    
        String initialStep = review.getWorkflowTable().getCurrentStep();
    
        review.loadNextReviewItem();
    
        String updatedStep = review.getWorkflowTable().getCurrentStep();
    
        assertNotEquals(initialStep, updatedStep);
    
    }

    /**
     * Doesn't have getter so just calling method to pass test.
     */
    @Test
    public void testPerformSupplementalChecks() {
    
        GenealogyRequestReview review = createReviewInstance();
    
        review.performSupplementalChecks();
        

    }

    @Test
    public void testEditData() {
        
        GenealogyRequestReview review = createReviewInstance();
        
        /**
         * Random values for testing purposes.
         */
        Form updatedForm = new Form(102, "UpdatedForm", "Updated Description");
        
        review.editData(updatedForm);
        
        assertEquals("UpdatedForm", review.getForm().getFormName());
    
    }

    @Test
    public void testValidateData() {
    
        GenealogyRequestReview review = createReviewInstance();
    
        boolean isValid = review.validateData();
    
        assertTrue(isValid);
    
    }

    @Test
    public void testNeedCorrections() {
    
        GenealogyRequestReview review = createReviewInstance();
    
        review.needCorrections();
    
        assertEquals("Returned", review.getReviewStatus());
    
    }

    @Test
    public void testFinalizeReview() {
    
        GenealogyRequestReview review = createReviewInstance();
    
        review.finalizeReview();
    
        assertEquals("Reviewed", review.getReviewStatus());
    
    }

    
     /** 
     * Doesn't have getter so just calling method to pass test.
     */
    @Test
    public void testReviewHistory() {
    
        GenealogyRequestReview review = createReviewInstance();
    
        review.reviewHistory("Test action recorded.");
        
    }

    @Test
    public void testStartReviewWithNullComments() {
        
        /**
         * Random values for testing purposes.
         */
        GenealogyRequestReview review = new GenealogyRequestReview(1, null, "Pending", new Form(101, "TestForm", "Description"), new WorkflowTable());
        
        review.startReview();
        
        assertEquals("Pending", review.getReviewStatus());
    
    }

    @Test
    public void testStartReviewWithEmptyComments() {
    
        /**
         * Random values for testing purposes.
         */
        GenealogyRequestReview review = new GenealogyRequestReview(1, "", "Pending", new Form(101, "TestForm", "Description"), new WorkflowTable());
    
        review.startReview();
    
        assertEquals("Pending", review.getReviewStatus());
    
    }

    /**
     * Meant for null and empty checks.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCreationWithNullForm() {
    
        /**
         * Random values for testing purposes.
         */
        new GenealogyRequestReview(1, "Initial Comment", "Pending", null, new WorkflowTable());
    
    }

    /**
     * Meant for null and empty checks.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCreationWithNullWorkflowTable() {
    
        /**
         * Random values for testing purposes.
         */
        new GenealogyRequestReview(1, "Initial Comment", "Pending", new Form(101, "TestForm", "Description"), null);
    
    }

    /**
     * How all the tests are being done due to making a GenealogyRequestReview class object.@interface
     * Random values for testing purposes.
     * @return object with the parameters seen in statement.
     */    
    private GenealogyRequestReview createReviewInstance() {
    
        return new GenealogyRequestReview(1, "Initial Comment", "Pending", new Form(101, "TestForm", "Description"), new WorkflowTable());
    
    }

}
