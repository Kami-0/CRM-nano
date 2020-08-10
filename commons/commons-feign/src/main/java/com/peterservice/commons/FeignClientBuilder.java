package com.peterservice.commons;

import com.peterservice.commons.decoders.InstantGsonDecoder;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonEncoder;
import feign.slf4j.Slf4jLogger;

public final class FeignClientBuilder {
    public static <T> T createClient(Class<T> type, String uri) {
        return Feign.builder()
                .logger(new Slf4jLogger())
                .logLevel(Logger.Level.FULL)
                .encoder(new GsonEncoder())
                .decoder(new InstantGsonDecoder())
                .target(type, uri);
    }
}
