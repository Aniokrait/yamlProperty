package io.github.aniokrait.yamlproperty.config.message;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.List;

@Configuration
public class MessageSourceConfig {
    @Bean
    MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setPropertiesPersister(new YamlPropertiesLoader());
        messageSource.setFileExtensions(List.of(".yml", ".yaml"));
        return messageSource;
    }
}
