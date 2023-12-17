package com.example.movie.service;

import com.example.movie.model.Movie;
import com.example.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MovieH2Service {

    @Autowired
    private MovieRepository movieRepository;

    public ArrayList<Movie> getMovies() {
        return movieRepository.getMovies();
    }

    public Movie getMovieById(int movieId) {
        return movieRepository.getMovieById(movieId);
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.addMovie(movie);
    }

    public Movie updateMovie(int movieId, Movie movie) {
        return movieRepository.updateMovie(movieId, movie);
    }

    public void deleteMovie(int movieId) {
        movieRepository.deleteMovie(movieId);
    }
}

