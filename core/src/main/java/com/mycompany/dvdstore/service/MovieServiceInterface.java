package com.mycompany.dvdstore.service;

import java.util.List;
import com.mycompany.dvdstore.entity.Movie;

public interface MovieServiceInterface {
  void registerMovie(Movie movie);

  List<Movie> getMovies();
}
