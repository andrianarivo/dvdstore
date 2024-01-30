package com.mycompany.dvdstore.core.service;

import java.util.List;
import com.mycompany.dvdstore.core.entity.Movie;

public interface MovieServiceInterface {
  void registerMovie(Movie movie);

  List<Movie> getMovies();
}
