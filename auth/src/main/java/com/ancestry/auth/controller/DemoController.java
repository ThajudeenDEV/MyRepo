package com.ancestry.auth.controller;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class DemoController {

    @GET
    @Path("/ping")
    @Produces(MediaType.APPLICATION_JSON)
    public String ping() {
        return "pong";
    }
}
