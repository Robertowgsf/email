package com.robertowgsf.email.service;

import com.robertowgsf.email.entity.Email;
import com.robertowgsf.email.repository.EmailRepository;
import com.robertowgsf.email.dto.SendEmailDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.MailSender;

import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {
    private final EmailRepository emailRepository;
    private final MailSender mailSender;

    @Override
    public Email send(SendEmailDTO dto) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(dto.getFrom());
        message.setTo(new String[]{dto.getTo()});
        message.setSubject(dto.getSubject());
        message.setText(dto.getText());

        Email email = new Email();
        BeanUtils.copyProperties(dto, email);

        try {
            mailSender.send(message);
        } catch (MailException exception) {
            email.setSuccess(false);
            log.error(exception.toString(), exception);
        } finally {
            emailRepository.save(email);
        }

        return email;
    }
}
