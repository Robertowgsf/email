package com.robertowgsf.email.validation;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ValidationError {
    public String field;
    public List<String> errors;
}
