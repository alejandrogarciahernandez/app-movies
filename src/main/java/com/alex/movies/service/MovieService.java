package com.alex.movies.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alex.movies.business.MovieBusiness;
import com.alex.movies.model.dto.MovieDTO;
import com.alex.movies.model.entity.Movie;
import com.alex.movies.model.mapper.MovieMapper;

@RestController
@RequestMapping(value="/api/movies")
public class MovieService {
	
	@Autowired
	private MovieBusiness movieBusiness;

	@Autowired
	private MovieMapper movieMapper;
	
	@GetMapping("/{id}")
	public MovieDTO getMovieById(@PathVariable(value= "id") Long id){
		return movieMapper.movieEntityToDto(movieBusiness.getMovieById(id));
	}
	
	@GetMapping
	public List<MovieDTO> getAllMovies(){
		return movieMapper.movieListToDTO(movieBusiness.getAllMovies());
	}
	
	@DeleteMapping
	public void deleteMovie(@RequestBody Movie movie) {
		movieMapper.movieEntityToDto(movieBusiness.deleteMovie(movie));
	}
	
	@PostMapping
	public MovieDTO createMovie(@Valid @RequestBody MovieDTO movie) {
		return movieMapper.movieEntityToDto(movieBusiness.createMovie(movieMapper.movieDtoToEntity(movie)));
	}
}
