package com.alex.movies.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.alex.movies.model.dto.MovieDTO;
import com.alex.movies.model.entity.Movie;
import com.alex.movies.service.MovieService;

@Mapper(componentModel="spring", uses=MovieService.class)
public interface MovieMapper {

	MovieDTO movieEntityToDto(Movie movie);
	Movie movieDtoToEntity(MovieDTO movieDTO);
	List<MovieDTO> movieListToDTO(List<Movie> movies);
	List<Movie> movieDTOListToMovie(List<MovieDTO> moviesDTO);
}
