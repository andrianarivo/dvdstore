package com.mycompany.dvdstore.repository;

import java.util.List;
import com.mycompany.dvdstore.entity.Movie;

public interface MovieRepositoryInterface {
  void add(Movie movie);

  List<Movie> list();
}
