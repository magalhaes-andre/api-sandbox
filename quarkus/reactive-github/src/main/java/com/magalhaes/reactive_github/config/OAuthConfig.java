package com.magalhaes.reactive_github.config;

import io.quarkus.arc.config.ConfigProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ConfigProperties(prefix = "oauth", namingStrategy = ConfigProperties.NamingStrategy.KEBAB_CASE)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OAuthConfig {

    protected String clientId;
    protected String redirectUri;
    protected String login;
    protected String scope;
    protected String state;
    protected String allowSignup;
}
