package com.mycompany.dvdstore.controller;

import java.util.Scanner;
import org.springframework.stereotype.Controller;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

@Controller
public class MovieController {
  private final MovieServiceInterface movieService;

  public MovieController(MovieServiceInterface movieService) {
    this.movieService = movieService;
  }

  public void addUsingConsole() {
    System.out.println("Enter movie title: ");
    try (Scanner sc = new Scanner(System.in)) {
      String title = sc.nextLine();
      System.out.println("Enter movie genre: ");
      String genre = sc.nextLine();
      Movie movie = new Movie();
      movie.setTitle(title);
      movie.setGenre(genre);
      movieService.registerMovie(movie);
    }
  }

  public MovieServiceInterface getMovieService() {
    return movieService;
  }

}
