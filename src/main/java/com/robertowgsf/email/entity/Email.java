package com.robertowgsf.email.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;

@Data
@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "\"from\"")
    private String from;
    @Column(name = "\"to\"")
    private String to;
    private String subject;
    private String text;
    private Instant sentDate;
    private Boolean success;

    public Email() {
        this.sentDate = Instant.now();
        this.success = true;
    }
}
