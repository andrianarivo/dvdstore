package com.mycompany.dvdstore.web.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;

@Controller
public class HomeController {
  private final MovieServiceInterface movieService;

  public HomeController(MovieServiceInterface movieService) {
    this.movieService = movieService;
  }

  @GetMapping("/add-movie-form")
  public String displayMovieForm(@ModelAttribute Movie movie) {
    return "add-movie-form";
  }

  @GetMapping("/home")
  public ModelAndView displayHome() {
    System.out.println("displayHome() called");
    List<Movie> movies = movieService.getMovies();
    ModelAndView modelAndView = new ModelAndView("dvdstore-home");
    modelAndView.addObject("movies", movies);
    return modelAndView;
  }


}
