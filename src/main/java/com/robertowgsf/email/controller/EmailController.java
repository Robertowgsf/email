package com.robertowgsf.email.controller;

import com.robertowgsf.email.service.EmailService;
import com.robertowgsf.email.dto.SendEmailDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("emails")
public class EmailController {
    private final EmailService emailService;

    @PostMapping
    public String send(@RequestBody @Valid SendEmailDTO dto) {
        var email = emailService.send(dto);
        var response = "Email sent successfuly!";

        if (!email.getSuccess()) {
            response = "Could not send email.";
        }

        return response;
    }
}
