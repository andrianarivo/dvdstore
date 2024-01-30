package com.mycompany.dvdstore.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

@Service
public class DefaultMovieService implements MovieServiceInterface {
  private final MovieRepositoryInterface movieRepository;

  public void registerMovie(Movie movie) {
    movieRepository.add(movie);
  }

  public MovieRepositoryInterface getMovieRepository() {
    return movieRepository;
  }

  public DefaultMovieService(MovieRepositoryInterface movieRepository) {
    this.movieRepository = movieRepository;
  }

  @Override
  public List<Movie> getMovies() {
    return movieRepository.list();
  }

}
