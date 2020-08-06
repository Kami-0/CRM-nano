package com.peterservice.rtco.sfa.decoder;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import feign.gson.GsonDecoder;

import java.time.Instant;

public class InstantGsonDecoder extends GsonDecoder {
    public InstantGsonDecoder() {
        super(new GsonBuilder()
                .registerTypeAdapter(Instant.class, (JsonDeserializer<Instant>) (json, type, jsonDeserializationContext) -> {
                    return Instant.parse(json.getAsJsonPrimitive().getAsString());
                }).create());
    }
}
