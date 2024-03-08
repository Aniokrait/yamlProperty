package io.github.aniokrait.yamlproperty.config.properties;

import io.github.aniokrait.yamlproperty.config.YamlPropertiesSourceFactory;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "server.servlet")
@PropertySource(value = {"classpath:/application-common.yml"}, factory = YamlPropertiesSourceFactory.class)
@Getter
@Setter
public class ServerServletConfig {
    private String contextPath;
}
