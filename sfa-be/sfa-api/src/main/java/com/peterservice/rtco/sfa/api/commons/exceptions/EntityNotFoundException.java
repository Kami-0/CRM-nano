package com.peterservice.rtco.sfa.api.commons.exceptions;

import com.peterservice.rtco.sfa.api.commons.types.EntityType;
import lombok.Getter;

@Getter
public class EntityNotFoundException extends RuntimeException {
    private final EntityType entityType;
    private final String message;

    public EntityNotFoundException(EntityType entityType, long id) {
        this.entityType = entityType;
        this.message = "Сущность с id: " + id + " не существует";
    }
}
