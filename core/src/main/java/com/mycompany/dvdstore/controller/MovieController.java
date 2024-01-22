package com.mycompany.dvdstore.controller;

import java.util.Scanner;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

public class MovieController {
  private MovieService movieService = new MovieService();

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
}
