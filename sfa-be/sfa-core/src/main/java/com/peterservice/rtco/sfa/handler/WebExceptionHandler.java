package com.peterservice.rtco.sfa.handler;

import com.peterservice.rtco.sfa.api.commons.exceptions.EntityNotFoundException;
import com.peterservice.rtco.sfa.api.commons.types.EntityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Daniil.Makarov
 */
@ControllerAdvice
public class WebExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    protected ResponseEntity<ExceptionResponseEntity> handleNotFoundException(EntityNotFoundException ex) {
        return new ResponseEntity<ExceptionResponseEntity>(
                new ExceptionResponseEntity(HttpStatus.NOT_FOUND.value(),
                        ex.getEntityType(),
                        ex.getMessage()),
                HttpStatus.NOT_FOUND);
    }

    @Data
    @AllArgsConstructor
    private static class ExceptionResponseEntity {
        private int status;
        private EntityType entityType;
        private String message;
    }
}
