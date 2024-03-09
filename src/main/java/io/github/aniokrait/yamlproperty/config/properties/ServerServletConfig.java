package io.github.aniokrait.yamlproperty.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "server.servlet")
@Getter
@Setter
public class ServerServletConfig {
    private String contextPath;
}
