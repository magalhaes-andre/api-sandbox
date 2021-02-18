package com.magalhaes.reactive_github.resource;

import com.magalhaes.reactive_github.config.ApiConfig;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/")
@ApplicationScoped
public class Configuration {

    @Inject
    private ApiConfig config;

    @Path("config")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Map<String, String>> configCheck(){
        return Uni.createFrom().item(configs());
    }

    public Map<String, String> configs(){
        Map<String, String> configs = new HashMap<String, String>();
        configs.put("token", config.getToken());
        configs.put("uri", config.getUri());
        return configs;
    }
}
