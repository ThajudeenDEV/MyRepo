package com.ancestry.auth.config;

import com.ancestry.auth.controller.DemoController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(DemoController.class);
    }
}
