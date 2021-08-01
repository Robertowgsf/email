package com.robertowgsf.email.service;

import com.robertowgsf.email.entity.Email;
import com.robertowgsf.email.dto.SendEmailDTO;

public interface EmailService {
    Email send(SendEmailDTO dto);
}
