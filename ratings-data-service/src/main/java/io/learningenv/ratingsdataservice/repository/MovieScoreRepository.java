package io.learningenv.ratingsdataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.learningenv.ratingsdataservice.db.MovieDB;
import io.learningenv.ratingsdataservice.model.MovieRating;

@Repository
public interface MovieScoreRepository extends JpaRepository<MovieDB,Integer>{

//	public MovieDB findByMovieId(String id);
	

	public MovieRating findByMovieId(String id);
	
	@Query(value="select score from moviedb.test where movie_id=:id",nativeQuery=true)
	public String fetchMovieScore(String id);
}
