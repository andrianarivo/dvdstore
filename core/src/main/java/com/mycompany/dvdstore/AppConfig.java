package com.mycompany.dvdstore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = {"com.mycompany.dvdstore.controller",
    "com.mycompany.dvdstore.service", "com.mycompany.dvdstore.repository.file"})
@PropertySource("classpath:application.properties")
public class AppConfig {

}
