
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmailServiceTest {

    @Test
    public void Should_ReturnTrue_When_EmailIsValidAndEmailIsSent() {
        String testSubject = "Hello User";
        String testBody = "Here are your forms";
        String emailAddress = "123@gmail.com";
        EmailService emailService = new EmailService(testSubject, testBody, List.of(new Form(0, "sample", "sample"), new Form(0, "sample", "sample")), emailAddress);

        assertNotNull(emailService.getSubject());
        assertNotNull(emailService.getBody());
        assertNotNull(emailService.getForms());
        assertNotNull(emailService.getEmailAddress());
        assertTrue(emailService.sendEmail());
    }

}