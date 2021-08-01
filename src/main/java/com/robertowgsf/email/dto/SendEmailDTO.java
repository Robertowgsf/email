package com.robertowgsf.email.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class SendEmailDTO {
    @NotBlank(message = "{email.from.not-blank}")
    @javax.validation.constraints.Email(message = "{email.from.email")
    private String from;
    @NotBlank(message = "{email.to.not-blank")
    @javax.validation.constraints.Email(message = "{email.to.email")
    private String to;
    @NotBlank(message = "{email.subject.not-blank}")
    private String subject;
    @NotBlank(message = "{email.text.not-blank}")
    private String text;
}
