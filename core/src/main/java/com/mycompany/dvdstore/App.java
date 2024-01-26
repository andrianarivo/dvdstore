package com.mycompany.dvdstore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import com.mycompany.dvdstore.controller.MovieController;

/**
 * Hello world!
 *
 */
@ComponentScan(basePackages = {"com.mycompany.dvdstore.controller",
    "com.mycompany.dvdstore.service", "com.mycompany.dvdstore.repository.file"})
@PropertySource("classpath:application.properties")
public class App {
  public static void main(String[] args) {
    try (AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(App.class)) {
      MovieController controller = context.getBean(MovieController.class);
      controller.addUsingConsole();
    }
  }
}
