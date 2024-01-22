package com.mycompany.dvdstore;

import java.util.Scanner;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter movie title: " );
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println( "Enter movie genre: " );
        String genre = sc.nextLine();
        MovieService movieService = new MovieService();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
    }
}
