package com.alex.movies.model.entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="MOVIES")
@Entity
public class Movie {
	
	@Id
	@Column(name="MOVIE_ID")
	private Long id;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="RELEASE_DATE")
	private LocalDate releaseDate;
	
	@Column(name="RATE")
	private Integer rate;
	
	//@Lob
	//@Column(name="MOVIE_PICTURE")
	//private byte[] image;

}
