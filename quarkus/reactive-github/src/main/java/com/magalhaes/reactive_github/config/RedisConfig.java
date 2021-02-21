package com.magalhaes.reactive_github.config;

import io.quarkus.arc.config.ConfigProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ConfigProperties(prefix = "api", namingStrategy = ConfigProperties.NamingStrategy.KEBAB_CASE)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ApiConfig {

    protected String token;
    protected String uri;
}
