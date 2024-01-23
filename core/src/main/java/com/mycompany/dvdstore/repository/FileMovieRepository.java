package com.mycompany.dvdstore.repository;

import java.io.FileWriter;
import java.io.IOException;

import com.mycompany.dvdstore.entity.Movie;

public class FileMovieRepository implements MovieRepositoryInterface {
  public void add(Movie movie) {
    FileWriter writer;
    try {
      writer = new FileWriter("movies.txt", true);
      writer.write(movie.getTitle() + ";" + movie.getGenre() + "\n");
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
