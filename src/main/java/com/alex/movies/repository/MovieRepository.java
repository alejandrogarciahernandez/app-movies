package com.alex.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alex.movies.model.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
