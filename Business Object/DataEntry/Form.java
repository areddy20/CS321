public class Form {
    private int formID;
    private String formName;
    private String formDescription;

    public Form(int formID, String formName, String formDescription){
        this.formID=formID;
        this.formName=formName;
        this.formDescription=formDescription;
    }
    public int getformID(){
        return formID;
    }
    public String getformName(){
        return formName;
    }
    public String getformDescription(){
        return formDescription;
    }
}
