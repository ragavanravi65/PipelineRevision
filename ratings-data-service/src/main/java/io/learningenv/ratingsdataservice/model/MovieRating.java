package io.learningenv.ratingsdataservice.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class MovieRating {
	private String movieId;
	private String score;
	
	public MovieRating(String movieId, String score) {
		this.movieId = movieId;
		this.score = score;
	}

}
