package lib;

public class Form {
    
    /**
     * All attributes in this class.
     */
    private int formID;
    private String formName;
    private String formDescription;

    /**
     * Initializing attributes
     * @param formID
     * @param formName
     * @param formDescription
     */
    public Form(int formID, String formName, String formDescription) {
        
        this.formID = formID;
        
        this.formName = formName;
        
        this.formDescription = formDescription;
    
    }

    /**
     * Getter for testing purposes.
     * @return formID as output.
     */
    public int getFormID() {
        
        return (formID);

    }

    /**
     * Getter for testing purposes.
     * @return formName as output.
     */
    public String getFormName() {
        
        return (formName);

    }

    /**
     * Getter for testing purposes.
     * @return formDescription as output.
     */
    public String getFormDescription() {
        
        return (formDescription);

    }
    
}

