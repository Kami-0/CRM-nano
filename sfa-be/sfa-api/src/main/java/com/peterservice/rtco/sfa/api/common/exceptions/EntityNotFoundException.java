package com.peterservice.rtco.sfa.api.common.exceptions;

import com.peterservice.rtco.sfa.api.common.types.EntityType;
import lombok.Getter;

/**
 * @author Daniil.Makarov
 */
@Getter
public class EntityNotFoundException extends RuntimeException {
    private final EntityType entityType;
    private final String message;

    public EntityNotFoundException(EntityType entityType, long id) {
        this.entityType = entityType;
        this.message = "Сущность с id: " + id + " не существует";
    }
}
