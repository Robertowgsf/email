package com.robertowgsf.email.repository;

import com.robertowgsf.email.entity.Email;
import org.springframework.data.repository.CrudRepository;

public interface EmailRepository extends CrudRepository<Email, Long> {
}
