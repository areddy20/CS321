import java.util.List;

public class EmailService {

    private String subject;
    private String body;
    private List<Form> forms;
    private String emailAddress;

   

    public EmailService(String subject, String body, List<Form> forms, String emailAddress ) {
        this.subject = subject;
        this.body = body;
        this.forms = forms;
        this.emailAddress = emailAddress;
    }

    public boolean sendEmail() {

        // TODO: Construct email based on variables of EmailService object, and then send email.
        // Returns false for now (so test is failed).
        return false;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Form> getForms() {
        return forms;
    }

    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

     public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
