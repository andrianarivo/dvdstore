package com.mycompany.dvdstore.web.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;

@Controller
@RequestMapping("/movie")
public class MovieController {
  private final MovieServiceInterface movieService;

  public MovieController(MovieServiceInterface movieService) {
    this.movieService = movieService;
  }

  public MovieServiceInterface getMovieService() {
    return movieService;
  }

  @RequestMapping("/home")
  public ModelAndView displayHome() {
    System.out.println("displayHome() called");
    List<Movie> movies = movieService.getMovies();
    ModelAndView modelAndView = new ModelAndView("dvdstore-home");
    modelAndView.addObject("movies", movies);
    return modelAndView;
  }

  @RequestMapping("/{id}")
  public String displayMovieCard(@PathVariable("id") Long id, Model model) {
    System.out.println("displayMovieCard() called");
    Movie movie = movieService.getMovieById(id);
    model.addAttribute("movie", movie);
    return "dvdstore-details";
  }

}
