package com.mycompany.dvdstore.core.repository.memory;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;

// @Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {
  private List<Movie> movies = new ArrayList<>();

  public void add(Movie movie) {
    movies.add(movie);
  }

  @Override
  public List<Movie> list() {
    return movies;
  }

  @Override
  public Movie getById(long id) {
    return movies.stream().filter(m -> m.getId() == id).findFirst().get();
  }
}
