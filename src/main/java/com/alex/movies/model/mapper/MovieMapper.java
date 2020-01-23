package com.alex.movies.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.alex.movies.model.dto.MovieDTO;
import com.alex.movies.model.entity.Movie;
import com.alex.movies.service.MovieService;

@Mapper(componentModel="spring", uses=MovieService.class)
public interface MovieMapper {

	MovieDTO movieEntityToDto(Movie movie);
	Movie movieDtoToEntity(MovieDTO movieDTO);
}
