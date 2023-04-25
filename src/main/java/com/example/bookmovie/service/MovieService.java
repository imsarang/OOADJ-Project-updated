package com.example.bookmovie.service;

import java.sql.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.bookmovie.models.Movie;

public interface MovieService {
    public List<Movie> getMovies();
    public Movie addMovie(Movie movie);
    // public void addMovie(String name, String genre, Integer durationMins, String releaseDate, String Description,
    //         MultipartFile file);

    public Movie getMovieById(Integer id);
    public boolean deleteMovie(Integer id);
}
