package com.alex.movies.business;

import java.util.List;

import org.springframework.stereotype.Component;

import com.alex.movies.model.entity.Movie;

/**
 * Interface business to work with Movies
 * 
 * @author jandr
 *
 */
public interface MovieBusiness {

	/**
	 * Create a movie
	 * @param movie Movie to create
	 */
	Movie createMovie(Movie movie);
	
	/**
	 * Update a movie
	 * @param Movie to update
	 */
	void updateMovie(Movie movie);
	
	/**
	 * Retrieve move by id
	 * @param id the id of the Movie
	 * @return the object Movie
	 */
	Movie getMovieById(Long id);
	
	/**
	 * Retrieve a list of all the movies
	 * @return the list of movies
	 */
	List<Movie> getAllMovies();
	
	/**
	 * Delete one movie
	 * @param movie
	 */
	void deleteMovie(Long id);
	
	
}
