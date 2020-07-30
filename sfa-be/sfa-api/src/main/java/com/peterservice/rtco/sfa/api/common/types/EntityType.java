package com.peterservice.rtco.sfa.api.common.types;

public enum EntityType {
    SALE_STATUS("Статус продажи"),
    SALE("Статус продажи");

    private final String name;

    EntityType(String name) {
        this.name = name;
    }
}
