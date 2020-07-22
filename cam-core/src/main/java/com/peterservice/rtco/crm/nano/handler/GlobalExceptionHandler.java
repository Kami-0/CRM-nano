package com.peterservice.rtco.crm.nano.handler;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> defaultErrorHandler(HttpServletRequest request, Exception e) {
        return makeResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, e.toString());
    }

    @ExceptionHandler(value = EntityNotFoundException.class)
    public ResponseEntity<Object> entityNotFoundHandler(HttpServletRequest request, EntityNotFoundException e) {
        return makeResponseEntity(HttpStatus.NOT_FOUND, e.getMessage());
    }

    @ExceptionHandler(value = DataIntegrityViolationException.class)
    public ResponseEntity<Object> dataIntegrityViolationHandler(HttpServletRequest request, DataIntegrityViolationException e) {
        return makeResponseEntity(HttpStatus.BAD_REQUEST, e.getMessage());
    }

    @ExceptionHandler(value = IncorrectResultSizeDataAccessException.class)
    public ResponseEntity<Object> incorrectResultSizeDataAccessHandler(HttpServletRequest request, IncorrectResultSizeDataAccessException e) {
        return makeResponseEntity(HttpStatus.BAD_REQUEST, e.getMessage());
    }

    private ResponseEntity<Object> makeResponseEntity(HttpStatus status, String error) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", new Date());
        body.put("status", status.value());
        body.put("error", error);
        return new ResponseEntity<>(body, status);
    }
}
