package com.alex.movies.model.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {
	
	private Long id;
	
	private String title;
	
	private String description;
	
	private LocalDate releaseDate;
	
	private Integer rate;

	private byte[] image;
}
