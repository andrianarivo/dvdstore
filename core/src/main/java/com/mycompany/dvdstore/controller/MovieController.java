package com.mycompany.dvdstore.controller;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

public class MovieController {
  @Autowired
  private MovieServiceInterface movieService;

  public void addUsingConsole() {
    System.out.println("Enter movie title: ");
    Scanner sc = new Scanner(System.in);
    String title = sc.nextLine();
    System.out.println("Enter movie genre: ");
    String genre = sc.nextLine();
    Movie movie = new Movie();
    movie.setTitle(title);
    movie.setGenre(genre);
    movieService.registerMovie(movie);
  }

  public MovieServiceInterface getMovieService() {
    return movieService;
  }

  public void setMovieService(MovieServiceInterface movieService) {
    this.movieService = movieService;
  }
}
