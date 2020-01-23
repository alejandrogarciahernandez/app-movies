package com.alex.movies.business.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alex.movies.business.MovieBusiness;
import com.alex.movies.model.entity.Movie;
import com.alex.movies.model.mapper.MovieMapper;
import com.alex.movies.repository.MovieRepository;

@Component
public class MovieBusinessImpl implements MovieBusiness {

	@Autowired
	MovieRepository movieRepository;

	@Override
	public Movie createMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public void updateMovie(Movie movie) {
		Movie movieToUpdate = movieRepository.getOne(movie.getId());
		movieToUpdate.setDescription(movie.getDescription());
		movieToUpdate.setTitle(movie.getTitle());
		movieToUpdate.setRate(movie.getRate());
		movieToUpdate.setReleaseDate(movie.getReleaseDate());
		movieToUpdate.setImage(movie.getImage());
		movieRepository.save(movieToUpdate);
	}

	@Override
	public Movie getMovieById(Long id) {
		return movieRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public void deleteMovie(Movie movie) {
		movieRepository.delete(movie);
		;
	}

}
