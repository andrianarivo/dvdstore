package com.mycompany.dvdstore.repository.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

@Repository
public class FileMovieRepository implements MovieRepositoryInterface {
  @Value("${movies.file}")
  private File file;

  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public void add(Movie movie) {
    FileWriter writer;
    try {
      writer = new FileWriter(file, true);
      writer.write(movie.getTitle() + ";" + movie.getGenre() + "\n");
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}