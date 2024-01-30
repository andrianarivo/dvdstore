package com.mycompany.dvdstore.web.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;

@Controller
public class HomeController {

  private MovieServiceInterface movieService;

  public HomeController(MovieServiceInterface movieService) {
    this.movieService = movieService;
  }

  @RequestMapping("/dvdstore-home")
  public @ModelAttribute("movies") List<Movie> displayHome() {
    System.out.println("displayHome() called");
    List<Movie> movies = movieService.getMovies();
    return movies;
  }
}
