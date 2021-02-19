package com.magalhaes.reactive_github.resource;

import com.magalhaes.reactive_github.config.ApiConfig;
import com.magalhaes.reactive_github.config.OAuthConfig;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
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
    private ApiConfig apiConfig;
    @Inject
    private OAuthConfig oauthConfig;

    @Path("config")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Map<String, Object>> configCheck(){
        return Uni.createFrom().item(configs());
    }

    private Map<String, Object> configs() {
        Map<String, Object> configs =  new HashMap<>();
        configs.put("API", apiConfig);
        configs.put("OAuth", oauthConfig);
        return configs;
    }
}
