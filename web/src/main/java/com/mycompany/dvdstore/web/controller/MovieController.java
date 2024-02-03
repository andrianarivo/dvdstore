package com.mycompany.dvdstore.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

  @GetMapping("/{id}")
  public String displayMovieCard(@PathVariable("id") Long id, Model model) {
    System.out.println("displayMovieCard() called");
    Movie movie = movieService.getMovieById(id);
    model.addAttribute("movie", movie);
    return "dvdstore-details";
  }

  @PostMapping("")
  public String addMovie(@ModelAttribute Movie movie) {
    movieService.registerMovie(movie);
    return "movie-added";
  }

}
