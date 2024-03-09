package io.github.aniokrait.yamlproperty.controller;

import io.github.aniokrait.yamlproperty.config.properties.ServerServletConfig;
import io.github.aniokrait.yamlproperty.config.properties.SpringDataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class MyController {

    @Autowired
    private ServerServletConfig servletConfig;

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private SpringDataSourceConfig springDataSourceConfig;

    @GetMapping("/")
    public String getProperty() {
        return servletConfig.getContextPath();
    }

    @GetMapping("/message")
    public String getMessage() {
        return messageSource.getMessage("some.kind.of.message", new String[]{"hoge"}, Locale.JAPANESE);
    }

    @GetMapping("/setting")
    public String getSpringSetting() {
        return springDataSourceConfig.getUrl();
    }
}
