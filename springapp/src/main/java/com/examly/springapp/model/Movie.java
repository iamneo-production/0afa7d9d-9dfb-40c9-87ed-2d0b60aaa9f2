package com.examly.springapp.model;

import javax.persistence.*;
@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id",unique = true,nullable = false)
	private int movieId;
	
	@Column(unique = true,nullable = false)
	private String name;
	
	private String description;
	private String director;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", description=" + description + ", director="
				+ director + "]";
	}
	
	
}
