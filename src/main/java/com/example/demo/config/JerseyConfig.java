package com.example.demo.config;

import com.example.demo.provider.ObjectMapperProvider;
import com.example.demo.resources.HelloWorldResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(ObjectMapperProvider.class);
        register(HelloWorldResource.class);
    }
}
