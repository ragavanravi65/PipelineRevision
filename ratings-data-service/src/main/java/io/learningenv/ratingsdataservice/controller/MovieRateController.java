package io.learningenv.ratingsdataservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.learningenv.ratingsdataservice.db.MovieDB;
import io.learningenv.ratingsdataservice.model.MovieRating;
import io.learningenv.ratingsdataservice.repository.MovieScoreRepository;

@RestController
@RequestMapping("/movies")
public class MovieRateController {
	@Autowired
	MovieScoreRepository movieScoreRepository;
	@RequestMapping("/{userId}")
	public List<MovieRating> getRating(@PathVariable("userId")String userId) {
		List<MovieRating> values=new ArrayList<>();
		values.add(new MovieRating("Jumanji","11"));
		return values;
				
	}
	
	
	@RequestMapping("/values/{movieId}")
	public MovieRating getmovieRating(@PathVariable("movieId")String movieId) {
		return movieScoreRepository.findByMovieId(movieId);
				
	}
	
//	@RequestMapping("/valueByPID/{movieId}")
//	public MovieDB getPIDmovieRating(@PathVariable("movieId")String movieId) {
//		System.out.println(movieScoreRepository.findByMovieId(movieId));
//		return movieScoreRepository.findByMovieId(movieId);
//	}
	@RequestMapping("/score/{movieId}")
	public String getmovieScore(@PathVariable("movieId")String movieId) {
	return movieScoreRepository.fetchMovieScore(movieId);
}
}
