package com.nevercaution.circlecitest.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloWorldHandler {

    public Mono<ServerResponse> helloWorld(ServerRequest request) {
        Mono<String> stringMono = Mono.just("hello world!!");
        return ServerResponse.ok().body(stringMono, String.class);
    }
}
