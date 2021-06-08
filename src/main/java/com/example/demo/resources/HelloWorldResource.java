package com.example.demo.resources;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Component
@Path("/")
public class HelloWorldResource {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response helloWorld() {
        Map<String, String> jsonObject = new HashMap<>();
        jsonObject.put("message", "Hello World");

        return Response.ok(jsonObject).build();
    }
}
