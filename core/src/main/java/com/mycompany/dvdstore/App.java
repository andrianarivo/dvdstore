package com.mycompany.dvdstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.mycompany.dvdstore.controller.MovieController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(App.class);
    MovieController controller = context.getBean(MovieController.class);
    controller.addUsingConsole();
  }
}
