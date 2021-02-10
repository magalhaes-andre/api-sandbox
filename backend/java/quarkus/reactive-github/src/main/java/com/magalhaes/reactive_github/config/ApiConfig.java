package com.magalhaes.reactive_github.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Singleton;

@Singleton
public class ApiConfig {

    @ConfigProperty(name = "api.token")
    private String token;
    @ConfigProperty(name = "api.uri")
    private String uri;

    public ApiConfig(String token, String uri) {
        this.token = token;
        this.uri = uri;
    }

    public ApiConfig() {
        this.token = null;
        this.uri = null;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
