package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.service.MovieService;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    MovieController movieController = new MovieController();
    MovieService movieService = new MovieService();
    GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
    movieService.setMovieRepository(movieRepository);
    movieController.setMovieService(movieService);
    movieController.addUsingConsole();
  }
}
