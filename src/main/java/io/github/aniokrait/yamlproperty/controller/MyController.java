package io.github.aniokrait.yamlproperty.controller;

import io.github.aniokrait.yamlproperty.config.properties.EnvConfig;
import io.github.aniokrait.yamlproperty.config.properties.ServerServletConfig;
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
    private EnvConfig envCOnfig;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/")
    public String getProperty() {
        return servletConfig.getContextPath() + " " + envCOnfig.getEnvProperty();
    }

    @GetMapping("/message")
    public String getMessage() {
        return messageSource.getMessage("some.kind.of.message", new String[]{"hoge"}, Locale.JAPANESE);
    }
}
