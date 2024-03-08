package io.github.aniokrait.yamlproperty.controller;

import io.github.aniokrait.yamlproperty.config.properties.EnvConfig;
import io.github.aniokrait.yamlproperty.config.properties.ServerServletConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ServerServletConfig servletConfig;

    @Autowired
    private EnvConfig envCOnfig;

    @GetMapping("/")
    public String getMessage() {
        return servletConfig.getContextPath() + " " + envCOnfig.getEnvProperty();
    }
}
