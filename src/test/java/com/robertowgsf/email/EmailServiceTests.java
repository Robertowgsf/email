package com.robertowgsf.email;

import com.robertowgsf.email.dto.SendEmailDTO;
import com.robertowgsf.email.entity.Email;
import com.robertowgsf.email.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class EmailServiceTests {

    @Autowired
    private EmailService emailService;

    @Test
    void shouldSendEmail() {
        SendEmailDTO sendEmailDTO = new SendEmailDTO("robertowgsf@gmail.com", "robertowgsf@gmail.com", "Test SES us-east-1", "Testing Amazon SES from us-east-1");
        Email email = emailService.send(sendEmailDTO);
        assertTrue(email.getSuccess());
    }
}
