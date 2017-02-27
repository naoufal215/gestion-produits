package com.enset.web;

import com.enset.ApplicationGestionCategoriesApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by naoufal on 27/02/2017.
 */
public class WebInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationGestionCategoriesApplication.class);
    }
}
